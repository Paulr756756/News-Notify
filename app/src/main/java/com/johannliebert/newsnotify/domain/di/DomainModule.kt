package com.johannliebert.newsnotify.domain.di

import com.johannliebert.newsnotify.data.remote.ApiService
import com.johannliebert.newsnotify.data.repository.GetNewsArticleRepoImpl
import com.johannliebert.newsnotify.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object DomainModule {
    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticleRepo{
        return GetNewsArticleRepoImpl(apiService = apiService)
    }

}