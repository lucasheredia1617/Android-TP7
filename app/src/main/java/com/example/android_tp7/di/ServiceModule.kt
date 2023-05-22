package com.example.android_tp7.di

import com.example.android_tp7.data.service.MovieServiceImpl
import com.example.android_tp7.domain.service.MovieService
import org.koin.dsl.module

object ServiceModule {
    val serviceModule = module {
        factory<MovieService> { MovieServiceImpl(get()) }
    }
}