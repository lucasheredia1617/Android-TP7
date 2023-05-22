package com.example.android_tp7.di

import org.koin.dsl.module

object ServiceModule {
    val serviceModule = module {
        factory<MovieService> { MovieServiceImpl(get()) }
    }
}