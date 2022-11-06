package com.johannliebert.newsnotify.presentation

import com.johannliebert.newsnotify.domain.model.Article

data class HomeStateHolder(
    val isLoading:Boolean = false,
    val data: List<Article>? =null,
    val error:String=""
)
