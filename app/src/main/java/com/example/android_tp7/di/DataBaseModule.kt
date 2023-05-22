package com.example.android_tp7.di

import org.koin.dsl.module

object DataBaseModule {
    val dataBaseModule = module {
        factory<MovieDataBase> { MovieDataBaseImpl(get()) }
    }
}