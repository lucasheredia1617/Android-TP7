package com.example.android_tp7.di

import org.koin.dsl.module

object ApiModule {
    val apiModule= module{
        factory { MovieRequestGenerator }
    }
}