package com.example.android_tp7.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android_tp7.data.database.MovieDao
import com.example.android_tp7.data.entity.MovieEntity

@Database(
    entities = [
        MovieEntity::class,
    ],
    version = 1,
)
abstract class MovieRoomDataBase : RoomDatabase() {
    abstract fun moviesDao(): MovieDao
}
