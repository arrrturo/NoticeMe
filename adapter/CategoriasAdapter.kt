package com.example.noticeme3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme3.Categorias
import com.example.noticeme3.R

class CategoriasAdapter(private val categoriasList:List<Categorias>, private val onClickListener: (Categorias) -> Unit) : RecyclerView.Adapter<CategoriasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return  CategoriasViewHolder(layoutInflater.inflate(R.layout.item_categoria, parent, false))
    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {

        val item = categoriasList[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = categoriasList.size
}