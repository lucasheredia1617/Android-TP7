package com.example.android_tp7.presentation.mvvm.model

import com.example.android_tp7.domain.entity.Movie
import com.example.android_tp7.domain.usecase.GetMovieUseCase
import com.example.android_tp7.domain.util.CoroutineResult

class MoviesModel(private val getMoviesUserCase: GetMovieUseCase) {
    suspend fun getMovies(): CoroutineResult<List<Movie>> = getMoviesUserCase()
}