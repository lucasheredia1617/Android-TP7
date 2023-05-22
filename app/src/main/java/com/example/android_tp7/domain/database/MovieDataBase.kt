package com.example.android_tp7.domain.database

import com.example.android_tp7.domain.entity.Movie
import com.example.android_tp7.domain.util.CoroutineResult

interface MovieDataBase {
    suspend fun insertMovies(movieList: List<Movie>)
    suspend fun getAllMovies(): CoroutineResult<List<Movie>>
}