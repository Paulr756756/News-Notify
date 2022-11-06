package com.johannliebert.newsnotify.domain.use_case

import com.johannliebert.newsnotify.domain.model.Article
import com.johannliebert.newsnotify.domain.repository.GetNewsArticleRepo
import com.johannliebert.newsnotify.utils.Resource
import kotlinx.coroutines.flow.*
import javax.inject.Inject
class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading(""))
        try{
            emit(Resource.Success(getNewsArticleRepo.getNewsArticle()))

        }catch (e:Exception){
            emit(Resource.Error(e.message))
        }

    }

}