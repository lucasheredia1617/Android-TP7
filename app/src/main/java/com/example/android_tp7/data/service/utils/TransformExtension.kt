package com.example.android_tp7.data.service.utils

import com.example.android_tp7.data.entity.MovieEntity
import com.example.android_tp7.data.service.response.ResultResponse
import com.example.android_tp7.domain.entity.Movie

fun ResultResponse.transformToList(): List<Movie> {
    val movieList = mutableListOf<Movie>()
    movies.forEach {
        movieList.add(
            Movie(
                it.title,
                it.overview,
                it.posterPath,
                it.releaseDate,
                it.originalLanguage,
                it.voteAverage,
                it.voteCount,
            ),
        )
    }
    return movieList
}

fun MovieEntity.toMovie() = Movie(
    this.title,
    this.overview,
    this.posterPath,
    this.releaseDate,
    this.originalLanguage,
    this.voteAverage,
    this.voteCount,
)

fun Movie.toMovieDB() = MovieEntity(
    this.title,
    this.overview,
    this.posterPath,
    this.releaseDate,
    this.originalLanguage,
    this.voteAverage,
    this.voteCount,
)

fun List<MovieEntity>.toMovieList() = this.map { it.toMovie() }
