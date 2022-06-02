package com.example.noticeme3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme3.NewsApple
import com.example.noticeme3.NewsTesla
import com.example.noticeme3.R

class NewsTeslaAdapter(private val newsList: List<NewsTesla>, private val onClickListener: (NewsTesla) -> Unit) : RecyclerView.Adapter<NewsTeslaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsTeslaViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return  NewsTeslaViewHolder(layoutInflater.inflate(R.layout.item_new, parent, false))
    }

    override fun onBindViewHolder(holder: NewsTeslaViewHolder, position: Int) {

        val item = newsList[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = newsList.size
}