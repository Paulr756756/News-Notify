package com.johannliebert.newsnotify.domain.model

import com.johannliebert.newsnotify.data.model.SourceDTO

data class Article(
    val content: String,
    val description: String,
    val urlToImage: String,
    val title : String
)
