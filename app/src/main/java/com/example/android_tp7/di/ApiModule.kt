package com.example.android_tp7.di

import com.example.android_tp7.data.service.MovieRequestGenerator
import org.koin.dsl.module

object ApiModule {
    val apiModule= module{
        factory { MovieRequestGenerator }
    }
}