package com.example.noticeme3

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import com.example.noticeme3.adapter.CategoriasAdapter
import com.example.noticeme3.databinding.ActivityHomeBinding
import com.google.firebase.auth.FirebaseAuth

enum class ProviderType{
    BASIC,
    GOOGLE
}

class HomeActivity : AppCompatActivity() {

    //variable global
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // datos que provienen del MainActivity, que se recogen aqui
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")

        setup(email ?: "", provider ?: "")

        //Guardado de datos, si el usuario mantiene la sesion iniciada este no tiene que volver a registrarse
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.putString("email", email)
        prefs.putString("provider", provider)
        prefs.apply()
    }

    @SuppressLint("WrongConstant")
    private fun setup(email: String, provider: String){

        val editUserButton = findViewById<Button>(R.id.editUserButton)
        val pasarEmailTextView = findViewById<TextView>(R.id.pasarEmailTextView)

        //variable del email que recogermos aqui para posteriormente pasarla a DataEditorActivity
        pasarEmailTextView.text = email
        val aVerSiFunciona = pasarEmailTextView.text.toString()

        title = "Inicio"

        // boton que cierra la sesion del usuario y devuelve al usuario al MainActivity
        binding.logOutButton.setOnClickListener {
            val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()

            FirebaseAuth.getInstance().signOut()
            showMainActivity()
        }

        // boton que abre el DataEditorActivity pasando el email del usuario con sesion iniciada en el momento
        editUserButton.setOnClickListener{
            showDataEditor(aVerSiFunciona)
        }

        // crear un listado horizontal con cada categoria de noticias para que el usuario eliga
        binding.recyclerViewCategorias.layoutManager = LinearLayoutManager(this, OrientationHelper.HORIZONTAL, false)
        binding.recyclerViewCategorias.adapter = CategoriasAdapter(CategoriasProvider.categoriasList) { categoria ->
            onItemSelected(
                categoria
            )
        }
    }

    // recoge la informacion de la categoria pulsada para mostrar las noticias de dicha categoiria
    fun onItemSelected(categoria: Categorias){
        showNews(categoria.position)
    }

    // mostrar MainActivity
    private fun showMainActivity(){
        val mainIntent = Intent(this, MainActivity::class.java)
        startActivity(mainIntent)
    }

    // Mostrar las noticias, se recoge el valor de la categoria para mostar solo las noticias de dicha categoria
    private fun showNews(categoria: Int){
        val newsIntent = Intent(this, NewsActivity::class.java).apply{
            putExtra("categoria", categoria)
        }
        startActivity(newsIntent)
    }

    // muestra DataEditorActivity
    private fun showDataEditor(email: String){
        val dataEditorIntent = Intent(this, DataEditorActivity::class.java).apply {
            putExtra("aVerSiPasa", email)
        }
        startActivity(dataEditorIntent)
    }

}