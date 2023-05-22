package com.example.android_tp7.domain.database

interface MovieDataBase {
    suspend fun insertMovies(movieList: List<Movie>)
    suspend fun getAllMovies(): CoroutineResult<List<Movie>>
}