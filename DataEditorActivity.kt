package com.example.noticeme3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieAnimationView
import com.example.noticeme3.databinding.ActivityDataEditorBinding
import com.google.firebase.firestore.FirebaseFirestore

class DataEditorActivity : AppCompatActivity() {

    //variables globales
    private lateinit var binding: ActivityDataEditorBinding
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataEditorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //variable email, que traemos desde la MainActivity
        val bundle = intent.extras
        val email = bundle?.getString("aVerSiPasa")
        setup(email ?: "")
    }

    private fun setup(email: String){
        title = "Editar datos del usuario"

        val salirEditorButton = findViewById<Button>(R.id.salirEditorButton)
        val editarUsuarioButton = findViewById<Button>(R.id.editarUsuarioButton)
        val eliminarUsuarioButton = findViewById<Button>(R.id.eliminarUsuarioButton)
        val editarNombreEditText = findViewById<EditText>(R.id.editarNombreEditText)
        val editarApellidosEditText = findViewById<EditText>(R.id.editarApellidoEditText)
        val editarTelefonoEditText = findViewById<EditText>(R.id.editarTelefonoEditText)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)

        emailTextView.text = email

        //cuando este activity carga por primera vez recoge los datos del usuario de la base de datos de firebase
        db.collection("usuarios").document(emailTextView.text.toString()).get().addOnSuccessListener {
            editarNombreEditText.setText(it.get("nombre") as String?)
            editarApellidosEditText.setText(it.get("apellidos") as String?)
            editarTelefonoEditText.setText(it.get("telefono") as String?)
        }

        //boton para modificar los datos del usuario
        editarUsuarioButton.setOnClickListener{
            if(binding.editarNombreEditText.text.isNotEmpty()
                && binding.editarApellidoEditText.text.isNotEmpty()
                && binding.editarTelefonoEditText.text.isNotEmpty()
                && binding.editarTelefonoEditText.text.toString().length >= 9){

                    // si todoo sale bien se cargan los datos del usuario a la base de datos y muestra un
                        // pequeño mensaje diciendo que el usuario se modificó correctamente
                Toast.makeText(this, "Usuario modificado correctamente", Toast.LENGTH_SHORT).show()
                db.collection("usuarios").document(emailTextView.text.toString()).set(
                    hashMapOf("nombre" to editarNombreEditText.text.toString(),
                        "apellidos" to editarApellidosEditText.text.toString(),
                        "telefono" to editarTelefonoEditText.text.toString())
                )
                camposCorrectos()
                setAnimation(binding.ivDataEditorLogo, R.raw.correcto)
            }else{
                camposErroneos()
                camposCorrectos()
                setAnimation(binding.ivDataEditorLogo, R.raw.error2)
            }
        }

        //boton paara eliminar los datos del usuario
        eliminarUsuarioButton.setOnClickListener{
            if(binding.editarNombreEditText.text.isNotEmpty()
                || binding.editarApellidoEditText.text.isNotEmpty()
                || binding.editarTelefonoEditText.text.isNotEmpty()){

                    //si todoo sale bien los datos se eliminan y muestra un pequeño mensaje al usuario
                Toast.makeText(this, "Datos del usuario eliminados con éxito", Toast.LENGTH_SHORT).show()
                db.collection("usuarios").document(emailTextView.text.toString()).delete()
                db.collection("usuarios").document(emailTextView.text.toString()).get().addOnSuccessListener {
                    editarNombreEditText.setText(it.get("nombre") as String?)
                    editarApellidosEditText.setText(it.get("apellidos") as String?)
                    editarTelefonoEditText.setText(it.get("telefono") as String?)
                }
                setAnimation(binding.ivDataEditorLogo, R.raw.borrar)
                invisible()
            }else{
                showAlertNoData()
            }
        }

        //finaliza la activity y vuelve al HomeActivity
        salirEditorButton.setOnClickListener{
            finish()
        }
    }


    // metodo que crea una animacion
    private fun setAnimation(imageView: LottieAnimationView, animation: Int){
        imageView.setAnimation(animation)
        imageView.playAnimation()
    }

    // metodo que hace invisible los errores de los campos de los datos del usuario
    private fun invisible(){
        binding.tvWarningNombreDE.isVisible = false
        binding.tvWarningApellidoDE.isVisible = false
        binding.tvWarningTelefonoDE.isVisible = false
    }

    // muestra un error: hay datos para que se borren
    private fun showAlertNoData(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("No hay datos que puedan ser borrados")
        builder.setPositiveButton("Ok", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    // comprueba cada campo donde el usuario puede cometer errores, si los soluciona este metodo oculta los erores solucionados
    private fun camposCorrectos(){
        if(binding.editarNombreEditText.text.isNotEmpty()){
            binding.tvWarningNombreDE.isVisible = false
        }
        if(binding.editarApellidoEditText.text.isNotEmpty()){
            binding.tvWarningApellidoDE.isVisible = false
        }
        if(binding.editarTelefonoEditText.text.isNotEmpty() && binding.editarTelefonoEditText.text.toString().length >= 9){
            binding.tvWarningTelefonoDE.isVisible = false
        }
    }

    // comprueba cada campo donde el usuario puede cometer errores, si el usuario comete errores este metodo muestra los erores cometidos
    private fun camposErroneos(){
        if(binding.editarNombreEditText.text.isEmpty()){
            binding.tvWarningNombreDE.isVisible = true
        }
        if(binding.editarApellidoEditText.text.isEmpty()){
            binding.tvWarningApellidoDE.isVisible = true
        }
        if(binding.editarTelefonoEditText.text.isEmpty() || binding.editarTelefonoEditText.text.toString().length < 9){
            binding.tvWarningTelefonoDE.isVisible = true
        }
    }
}