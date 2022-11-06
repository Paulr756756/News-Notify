package com.johannliebert.newsnotify.mappers

import com.johannliebert.newsnotify.data.model.ArticleDTO
import com.johannliebert.newsnotify.domain.model.Article

fun List<ArticleDTO>.toDomain():List<Article>{
        return map{
            Article(
                content = it.content?:"",
                description = it.description?:"",
                urlToImage = it.urlToImage?:"",
                title = it.title?:""
            )
        }
}