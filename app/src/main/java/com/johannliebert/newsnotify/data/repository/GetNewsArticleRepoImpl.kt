package com.johannliebert.newsnotify.data.repository

import com.johannliebert.newsnotify.data.remote.ApiService
import com.johannliebert.newsnotify.domain.model.Article
import com.johannliebert.newsnotify.domain.repository.GetNewsArticleRepo
import com.johannliebert.newsnotify.mappers.toDomain
import com.johannliebert.newsnotify.utils.SafeApiRequest
import javax.inject.Inject


class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    GetNewsArticleRepo , SafeApiRequest(){
    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response?.articles?.toDomain()!!
    }
}