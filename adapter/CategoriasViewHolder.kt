package com.example.noticeme3.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.noticeme3.Categorias

import com.example.noticeme3.databinding.ItemCategoriaBinding

class CategoriasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = ItemCategoriaBinding.bind(itemView)

    fun bind(categoriaModel: Categorias, onClickListener: (Categorias) -> Unit){

        binding.tvCategoriaNoticia.text = categoriaModel.title
        Glide.with(binding.ivCategoriaNoticia.context).load(categoriaModel.image).into(binding.ivCategoriaNoticia)

        binding.linearLayout.setOnClickListener {
            onClickListener(categoriaModel)
        }
    }
}