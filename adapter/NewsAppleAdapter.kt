package com.example.noticeme3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme3.NewsApple
import com.example.noticeme3.R

class NewsAppleAdapter(private val newsList: List<NewsApple>, private val onClickListener: (NewsApple) -> Unit) : RecyclerView.Adapter<NewsAppleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAppleViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return  NewsAppleViewHolder(layoutInflater.inflate(R.layout.item_new, parent, false))
    }

    override fun onBindViewHolder(holder: NewsAppleViewHolder, position: Int) {

        val item = newsList[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = newsList.size
}