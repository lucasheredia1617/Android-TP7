package com.example.android_tp7.domain.usecase

import com.example.android_tp7.domain.database.MovieDataBase
import com.example.android_tp7.domain.entity.Movie
import com.example.android_tp7.domain.service.MovieService
import com.example.android_tp7.domain.util.CoroutineResult

interface GetMovieUseCase{
    suspend operator fun invoke(): CoroutineResult<List<Movie>>
}
class GetMoviesUserCaseImpl(
    private val movieService: MovieService,
    private val db: MovieDataBase
): GetMovieUseCase{
    override suspend operator fun invoke(): CoroutineResult<List<Movie>> {
        return when (val serviceResult = movieService.getMovies()){
            is CoroutineResult.Success -> {
                db.insertMovies(serviceResult.data)
                db.getAllMovies()
            }
            is CoroutineResult.Failure -> {
                db.getAllMovies()
            }
        }
    }
}