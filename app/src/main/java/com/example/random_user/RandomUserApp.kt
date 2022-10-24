package com.example.random_user

import android.app.Application
import com.example.random_user.features.randomuser.di.RandomUserModule
import com.example.random_user.network.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RandomUserApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@RandomUserApp)
            modules(
                NetworkModule.module,
                RandomUserModule.module
            )
        }
    }
}