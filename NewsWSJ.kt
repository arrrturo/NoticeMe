package com.example.noticeme3

//data clas que contiene las variables de cada Noticia de WSJ
data class NewsWSJ(
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?
)