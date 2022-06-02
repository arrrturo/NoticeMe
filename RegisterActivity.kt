package com.example.noticeme3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieAnimationView
import com.example.noticeme3.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class RegisterActivity : AppCompatActivity() {

    //variables globales
    private val db = FirebaseFirestore.getInstance()
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup(){

        val registrarNombreEditText = findViewById<EditText>(R.id.registrarNombreEditText)
        val registrarApellidoEditText = findViewById<EditText>(R.id.registrarApellidoEditText)
        val registrarEmailEditText = findViewById<EditText>(R.id.registrarEmailEditText)
        val registrarPasswordEditText = findViewById<EditText>(R.id.registrarPasswordEditText)
        val registrarTelefonoEditText = findViewById<EditText>(R.id.registrarTelefonoEditText)

        title = "Registro"

        // boton, si todo es correcto registra al usuario
        binding.registrarUsuarioButton.setOnClickListener{
            if (registrarNombreEditText.text.isNotEmpty()
                && registrarApellidoEditText.text.isNotEmpty()
                && registrarEmailEditText.text.isNotEmpty()
                && registrarPasswordEditText.text.isNotEmpty()
                && registrarTelefonoEditText.text.isNotEmpty()
                && registrarEmailEditText.text.toString().contains("@")
                && registrarPasswordEditText.text.toString().length >= 6
                && registrarTelefonoEditText.text.toString().length >= 9){


                registrarUsuario()


            }else{
                camposErroneos()
                camposCorrectos()
                setAnimation(binding.ivRegisterLogo, R.raw.error2)
            }
        }

        // finaliza la activity y vuelve al MainActivity
        binding.cancelarRegistroButton.setOnClickListener{
            finish()
        }
    }

    // Crea una animacion
    private fun setAnimation(imageView: LottieAnimationView, animation: Int){
        imageView.setAnimation(animation)
        imageView.playAnimation()
    }

    // comprueba cada campo donde el usuario puede cometer errores, si los soluciona este metodo oculta los erores solucionados
    private fun camposCorrectos(){
        if(binding.registrarNombreEditText.text.isNotEmpty()){
            binding.tvWarningNombre.isVisible = false
        }
        if(binding.registrarApellidoEditText.text.isNotEmpty()){
            binding.tvWarningApellido.isVisible = false
        }
        if(binding.registrarTelefonoEditText.text.isNotEmpty() && binding.registrarTelefonoEditText.text.toString().length >= 9){
            binding.tvWarningTelefono.isVisible = false
        }
        if(binding.registrarEmailEditText.text.isNotEmpty() && binding.registrarEmailEditText.text.toString().contains("@")){
            binding.tvWarningEmail.isVisible = false
        }
        if(binding.registrarPasswordEditText.text.isNotEmpty() && binding.registrarPasswordEditText.text.toString().length >= 6){
            binding.tvWarningPassword.isVisible = false
        }
    }

    // comprueba cada campo donde el usuario puede cometer errores, si el usuario comete errores este metodo muestra los erores cometidos
    private fun camposErroneos(){
        if(binding.registrarNombreEditText.text.isEmpty()){
            binding.tvWarningNombre.isVisible = true
        }
        if(binding.registrarApellidoEditText.text.isEmpty()){
            binding.tvWarningApellido.isVisible = true
        }
        if(binding.registrarTelefonoEditText.text.isEmpty() || binding.registrarTelefonoEditText.text.toString().length < 9){
            binding.tvWarningTelefono.isVisible = true
        }
        if(binding.registrarEmailEditText.text.isEmpty() || !binding.registrarEmailEditText.text.toString().contains("@")){
            binding.tvWarningEmail.isVisible = true
        }
        if(binding.registrarPasswordEditText.text.isEmpty() || binding.registrarPasswordEditText.text.toString().length < 6){
            binding.tvWarningPassword.isVisible = true
        }
    }

    // muestra el HomeActivity
    private fun showHome(email: String, provider: ProviderType){
        val homeIntent: Intent = Intent(this, HomeActivity::class.java).apply{
            putExtra("email", email)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)
    }

    // muestra error
    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Ha ocurrido algo inesperado")
        builder.setPositiveButton("Ok", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    // metodo para registrar al usuario dentro de la base de datos
    private fun registrarUsuario(){
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(
            binding.registrarEmailEditText.text.toString(),
            binding.registrarPasswordEditText.text.toString()).addOnCompleteListener {
            if (it.isSuccessful) {
                db.collection("usuarios").document(binding.registrarEmailEditText.text.toString()).set(
                    hashMapOf("nombre" to binding.registrarNombreEditText.text.toString(),
                        "apellidos" to binding.registrarApellidoEditText.text.toString(),
                        "telefono" to binding.registrarTelefonoEditText.text.toString())
                )
                showHome(binding.registrarEmailEditText.text.toString(), ProviderType.BASIC)
            } else {
                showAlert()
            }
        }
    }
}