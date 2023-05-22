package com.example.android_tp7.data.service

import com.example.android_tp7.data.service.api.MovieClient
import com.example.android_tp7.data.service.utils.transformToList
import com.example.android_tp7.domain.entity.Movie
import com.example.android_tp7.domain.service.MovieService
import com.example.android_tp7.domain.util.CoroutineResult

class MovieServiceImpl(private val api:MovieRequestGenerator): MovieService {
    override suspend fun getMovies(): CoroutineResult<List<Movie>> {
        try {
            val callResponse = api.createService(MovieClient::class.java).getPopularMovies()
            val response = callResponse.execute()
            if (response.isSuccessful){
                response.body()?.let{
                    return CoroutineResult.Success(it.transformToList())
                }
            }
        }catch (e : Exception){
            return CoroutineResult.Failure(e)
        }
        return CoroutineResult.Failure(java.lang.Exception())
    }
}