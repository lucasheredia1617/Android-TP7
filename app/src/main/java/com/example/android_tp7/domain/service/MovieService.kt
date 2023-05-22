package com.example.android_tp7.domain.service

interface MovieService {
    suspend fun getMovies(): CoroutineResult<List<Movie>>
}