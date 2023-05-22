package com.example.android_tp7.presentation

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class MoviesApplication: Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@MoviesApplication)

            modules(
                listOf(
                    viewModelModule,
                    serviceModule,
                    modelModule,
                    useCaseModule,
                    apiModule,
                    dbModule,
                    dataBaseModule
                )
            )
        }
    }
}