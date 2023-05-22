package com.example.android_tp7.di

import com.example.android_tp7.domain.usecase.GetMovieUseCase
import com.example.android_tp7.domain.usecase.GetMoviesUserCaseImpl
import org.koin.dsl.module

object UseCaseModule {
    val useCaseModule = module {
        factory<GetMovieUseCase> { GetMoviesUserCaseImpl(get(),get()) }
    }
}