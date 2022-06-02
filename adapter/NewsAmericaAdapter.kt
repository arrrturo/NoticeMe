package com.example.noticeme3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme3.NewsAmerica
import com.example.noticeme3.R

class NewsAmericaAdapter(private val newsList: List<NewsAmerica>, private val onClickListener: (NewsAmerica) -> Unit) : RecyclerView.Adapter<NewsAmericaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAmericaViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return  NewsAmericaViewHolder(layoutInflater.inflate(R.layout.item_new, parent, false))
    }

    override fun onBindViewHolder(holder: NewsAmericaViewHolder, position: Int) {

        val item = newsList[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = newsList.size
}