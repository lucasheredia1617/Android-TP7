package com.example.android_tp7.data.database

import java.lang.Exception

class MovieDataBaseImpl(private val movieDao: MovieDao): MovieDataBase {
    override suspend fun insertMovies(movieList: List<Movie>) {
        movieList.forEach {
            movieDao.insertMovie(it.toMovieDB())
        }

    }

    override suspend fun getAllMovies(): CoroutineResult<List<Movie>> =
        movieDao.getPopularMovies().let {
            if(it.isNotEmpty()){
                CoroutineResult.Success(it.toMovieList())
            }else{
                CoroutineResult.Failure(Exception())
            }
        }
}