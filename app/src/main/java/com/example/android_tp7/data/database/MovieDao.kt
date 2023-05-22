package com.example.android_tp7.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android_tp7.data.entity.MovieEntity

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(binEntity: MovieEntity): Long

    @Query("SELECT * FROM movie")
    fun getPopularMovies(): List<MovieEntity>
}