package com.johannliebert.newsnotify.data.model

data class NewsDTO(
    val articles: List<ArticleDTO>?,
    val status: String?,
    val totalResults: Int?
)