package com.example.android_tp7.di

import com.example.android_tp7.data.database.MovieDataBaseImpl
import com.example.android_tp7.domain.database.MovieDataBase
import org.koin.dsl.module

object DataBaseModule {
    val dataBaseModule = module {
        factory<MovieDataBase> { MovieDataBaseImpl(get()) }
    }
}