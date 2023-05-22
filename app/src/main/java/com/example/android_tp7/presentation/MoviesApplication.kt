package com.example.android_tp7.presentation

import android.app.Application
import com.example.android_tp7.di.ApiModule.apiModule
import com.example.android_tp7.di.DBModule.dbModule
import com.example.android_tp7.di.DataBaseModule.dataBaseModule
import com.example.android_tp7.di.ServiceModule.serviceModule
import com.example.android_tp7.di.UseCaseModule.useCaseModule
import com.example.android_tp7.presentation.di.ModelModule.modelModule
import com.example.android_tp7.presentation.di.ViewModelModule.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class MoviesApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MoviesApplication)

            modules(
                listOf(
                    viewModelModule,
                    serviceModule,
                    modelModule,
                    useCaseModule,
                    apiModule,
                    dbModule,
                    dataBaseModule,
                ),
            )
        }
    }
}
