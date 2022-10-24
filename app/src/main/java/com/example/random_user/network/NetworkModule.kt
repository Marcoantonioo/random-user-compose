package com.example.random_user.network

import org.koin.dsl.module

object NetworkModule {
    val module = module {
        single { RetrofitConfig.provideRetrofit() }
    }
}