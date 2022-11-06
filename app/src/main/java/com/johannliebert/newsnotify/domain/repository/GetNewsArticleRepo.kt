package com.johannliebert.newsnotify.domain.repository

import com.johannliebert.newsnotify.domain.model.Article

interface GetNewsArticleRepo {
    suspend fun getNewsArticle():List<Article>
}