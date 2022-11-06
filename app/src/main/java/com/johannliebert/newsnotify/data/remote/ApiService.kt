package com.johannliebert.newsnotify.data.remote

import com.johannliebert.newsnotify.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country")country:String = "in",
        @Query("apiKey")apiKey:String = "f5395158970f4f29a19682c5ea2f1c1c"
    ) : Response<NewsDTO>
}