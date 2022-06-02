package com.example.noticeme3

//data clas que contiene las variables de cada Noticia de Apple
data class NewsApple(
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?
)