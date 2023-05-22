package com.example.android_tp7.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android_tp7.data.entity.MovieEntity

@Database(
    entities = [
        MovieEntity::class,
    ],
    version = 1
)

abstract class MovieDB : RoomDatabase() {
    abstract fun moviesDao(): MovieDao
}