package com.example.noticeme3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme3.NewsWSJ
import com.example.noticeme3.R

class NewsWSJAdapter(private val newsList: List<NewsWSJ>, private val onClickListener: (NewsWSJ) -> Unit) : RecyclerView.Adapter<NewsWSJViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsWSJViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return  NewsWSJViewHolder(layoutInflater.inflate(R.layout.item_new, parent, false))
    }

    override fun onBindViewHolder(holder: NewsWSJViewHolder, position: Int) {

        val item = newsList[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = newsList.size
}