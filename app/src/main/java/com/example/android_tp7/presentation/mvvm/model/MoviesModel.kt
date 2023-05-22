package com.example.android_tp7.presentation.mvvm.model

class MoviesModel(private val getMoviesUserCase: GetMovieUseCase) {
    suspend fun getMovies(): CoroutineResult<List<Movie>> = getMoviesUserCase()
}