package com.example.android_tp7.domain.service

import com.example.android_tp7.domain.entity.Movie
import com.example.android_tp7.domain.util.CoroutineResult

interface MovieService {
    suspend fun getMovies(): CoroutineResult<List<Movie>>
}