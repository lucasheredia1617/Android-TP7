package com.example.android_tp7.data.database

import com.example.android_tp7.data.service.utils.toMovieDB
import com.example.android_tp7.data.service.utils.toMovieList
import com.example.android_tp7.domain.database.MovieDataBase
import com.example.android_tp7.domain.entity.Movie
import com.example.android_tp7.domain.util.CoroutineResult
import java.lang.Exception

class MovieDataBaseImpl(private val movieDao: MovieDao) : MovieDataBase {
    override suspend fun insertMovies(movieList: List<Movie>) {
        movieList.forEach {
            movieDao.insertMovie(it.toMovieDB())
        }
    }

    override suspend fun getAllMovies(): CoroutineResult<List<Movie>> =
        movieDao.getPopularMovies().let {
            if (it.isNotEmpty()) {
                CoroutineResult.Success(it.toMovieList())
            } else {
                CoroutineResult.Failure(Exception())
            }
        }
}
