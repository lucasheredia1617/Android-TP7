package com.example.android_tp7.presentation.di

import org.koin.dsl.module

object ModelModule {
    val modelModule = module{
        factory{ MoviesModel(get()) }
    }
}