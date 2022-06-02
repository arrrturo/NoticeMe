package com.example.noticeme3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.noticeme3.adapter.*
import com.example.noticeme3.databinding.ActivityNewsBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsActivity : AppCompatActivity() {

    //variable global
    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val categoria = bundle?.getInt("categoria")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        initRecyclerView(categoria ?: 0)

        title = "Noticias"

    }

    // tipica flcha de ir atras, arriba en la esquina superior izquierda
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return false
    }

    // metodo que recibe la categoria pulsada por el usuario, dependiendo de cual fue pulsada, carga las noticias de dicha categoria
    fun initRecyclerView(categoria: Int) {

        if (categoria == 1){
            binding.recyclerNews.layoutManager = LinearLayoutManager(this)
            binding.recyclerNews.adapter = NewsAppleAdapter(NewsAppleProvider.newsAppleList) { newsApple ->
                onItemAppleSelected(
                    newsApple
                )
            }
        }
        if(categoria == 2){
            binding.recyclerNews.layoutManager = LinearLayoutManager(this)
            binding.recyclerNews.adapter = NewsTeslaAdapter(NewsTeslaProvider.newsTeslaList) { newsTesla ->
                onItemTeslaSelected(
                    newsTesla
                )
            }
        }
        if(categoria == 3){
            binding.recyclerNews.layoutManager = LinearLayoutManager(this)
            binding.recyclerNews.adapter = NewsWSJAdapter(NewsWSJProvider.newsWSJList) { newsWSJ ->
                onItemWSJSelected(
                    newsWSJ
                )
            }
        }
        if(categoria == 4){
            binding.recyclerNews.layoutManager = LinearLayoutManager(this)
            binding.recyclerNews.adapter = NewsAmericaAdapter(NewsAmericaProvider.newsAmericaList) { newsWSJ ->
                onItemAmericaSelected(
                    newsWSJ
                )
            }
        }
        if(categoria == 5){
            binding.recyclerNews.layoutManager = LinearLayoutManager(this)
            binding.recyclerNews.adapter = NewsTechCrunchAdapter(NewsTechCrunchProvider.newsTechCrunchList) { newsTC ->
                onItemTechCrunchSelected(
                    newsTC
                )
            }
        }
        if(categoria < 1 || categoria > 5){
            Toast.makeText(this, "Error al cargar las noticias", Toast.LENGTH_SHORT).show()
        }
    }

    //metodo para cargar noticias de Apple
    fun onItemAppleSelected(new: NewsApple){
        val url = new.url
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(
            intent
        )
    }

    //metodo para cargar noticias de Tesla
    fun onItemTeslaSelected(new: NewsTesla){
        val url = new.url
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(
            intent
        )
    }

    //metodo para cargar noticias de WSJ
    fun onItemWSJSelected(new: NewsWSJ){
        val url = new.url
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(
            intent
        )
    }

    //metodo para cargar noticias de America
    fun onItemAmericaSelected(new: NewsAmerica){
        val url = new.url
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(
            intent
        )
    }

    //metodo para cargar noticias de ThechCrunch
    fun onItemTechCrunchSelected(new: NewsTechCrunch){
        val url = new.url
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(
            intent
        )
    }
}