package com.example.noticeme3.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.noticeme3.NewsWSJ
import com.example.noticeme3.databinding.ItemNewBinding

class NewsWSJViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemNewBinding.bind(view)

    fun bind(newModel: NewsWSJ, onClickListener: (NewsWSJ) -> Unit){

        binding.tvTitle.text = newModel.title
        binding.tvDescription.text = newModel.description
        binding.tvAuthor.text = newModel.author
        binding.tvFechaDeLaNoticia.text = newModel.publishedAt
        Glide.with(binding.ivImageUrl.context).load(newModel.urlToImage).into(binding.ivImageUrl)

        binding.linearLayout.setOnClickListener {
            onClickListener(newModel)
        }
    }
}