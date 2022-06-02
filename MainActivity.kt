package com.example.noticeme3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.airbnb.lottie.LottieAnimationView
import com.example.noticeme3.databinding.ActivityMainBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    // variables globales
    private val GOOGLE_SIGN_IN = 100
    private lateinit var binding: ActivityMainBinding

    //metodo onCreate
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.NoticeMe3Theme)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Analytics
        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Firebase integration completed")
        analytics.logEvent("InitScreen", bundle)

        setup()
        session()
    }

    //metodo que sirve para saber si un usuario tiene sesion activa o no
    private fun session(){
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
        val email = prefs.getString("email", null)
        val provider = prefs.getString("provider", null)

        if(email != null && provider != null){
            showHome(email, ProviderType.valueOf(provider))
        }
    }

    //setup, controla botones y las posibles acciones que pueda hacer el usuario
    private fun setup(){

        val accederButton = findViewById<Button>(R.id.accederButton)
        val registrarButton = findViewById<Button>(R.id.resgitrarButton)
        val contraseñaEditText = findViewById<EditText>(R.id.contraseñaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val googleLoginButton = findViewById<Button>(R.id.googleLoginButton)

        title = "Login"

        //Boton que comprueba si la cuenta del usuario realmente existe en firebase para darle acceso a la siguiente activity o no
        accederButton.setOnClickListener{

            if(emailEditText.text.isNotEmpty()
                && contraseñaEditText.text.isNotEmpty()){

                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    emailEditText.text.toString(),
                    contraseñaEditText.text.toString())
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            showHome(emailEditText.text.toString(), ProviderType.BASIC)
                        } else {
                            showAlert()
                        }
                    }
            }else{
                showAlert()
            }
        }

        //boton que lanza el registro por google
         googleLoginButton.setOnClickListener{

             val googleConf = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                 .requestIdToken(getString(R.string.default_web_client_id))
                 .requestEmail()
                 .build()
             val googleClient = GoogleSignIn.getClient(this, googleConf)

             googleClient.signOut()
             startActivityForResult(googleClient.signInIntent, GOOGLE_SIGN_IN)
         }

        //boton que lanza la activity de Registrar al usuario
        registrarButton.setOnClickListener {
            showRegister()
        }
    }

    //metodo para mostrar el HomeActivity
    private fun showHome(email: String, provider: ProviderType){
        val homeIntent: Intent = Intent(this, HomeActivity::class.java).apply{
            putExtra("email", email)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)
    }

    //metodo para mostrar error en correo o contraseña
    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Correo o contraseña no válidos")
        builder.setPositiveButton("Ok", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    //metodo para mostrar el RegisterActivity
    private fun showRegister(){
        startActivity(Intent(this, RegisterActivity::class.java))
    }

    // metodo que gestiona las cuentas de google
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == GOOGLE_SIGN_IN){
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)

                if(account != null){
                    val credential = GoogleAuthProvider.getCredential(account.idToken, null)
                    FirebaseAuth.getInstance().signInWithCredential(credential).addOnCompleteListener {
                        if (it.isSuccessful) {
                            showHome(it.result?.user?.email ?: "", ProviderType.GOOGLE)
                        } else {
                            showAlert()
                        }
                    }
                }
            }catch (e: ApiException){
                showAlert()
            }
        }
    }
}