package com.example.android_tp7.di

import org.koin.dsl.module

object UseCaseModule {
    val useCaseModule = module {
        factory<GetMovieUseCase> { GetMoviesUserCaseImpl(get(),get()) }
    }
}