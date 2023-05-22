package com.example.android_tp7.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        MovieEntity::class,
    ],
    version = 1,
)
abstract class MovieRoomDataBase : RoomDatabase() {
    abstract fun moviesDao(): MovieDao
}
