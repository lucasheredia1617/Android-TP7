package com.example.android_tp7.presentation.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ViewModelModule {
    val viewModelModule = module {
        viewModel { MoviesViewModel(get()) }
    }
}