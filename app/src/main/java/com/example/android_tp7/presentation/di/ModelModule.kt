package com.example.android_tp7.presentation.di

import com.example.android_tp7.presentation.mvvm.model.MoviesModel
import org.koin.dsl.module

object ModelModule {
    val modelModule = module{
        factory{ MoviesModel(get()) }
    }
}