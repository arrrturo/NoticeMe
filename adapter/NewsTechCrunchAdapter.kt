package com.example.noticeme3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noticeme3.NewsTechCrunch
import com.example.noticeme3.R

class NewsTechCrunchAdapter(private val newsList: List<NewsTechCrunch>, private val onClickListener: (NewsTechCrunch) -> Unit) : RecyclerView.Adapter<NewsTechCrunchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsTechCrunchViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return  NewsTechCrunchViewHolder(layoutInflater.inflate(R.layout.item_new, parent, false))
    }

    override fun onBindViewHolder(holder: NewsTechCrunchViewHolder, position: Int) {

        val item = newsList[position]
        holder.bind(item, onClickListener)
    }

    override fun getItemCount(): Int = newsList.size
}