package com.example.android_tp7.di

import androidx.room.Room
import org.koin.dsl.module

object DBModule {
    private const val DB = "MovieDataBase"

    val dbModule = module {
        single { Room.databaseBuilder(get(), MovieRoomDataBase::class.java, DB).build() }
        single { get<MovieRoomDataBase>().moviesDao() }
    }
}