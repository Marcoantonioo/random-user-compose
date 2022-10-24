package com.example.random_user.features.randomuser.di

import com.example.random_user.features.randomuser.data.remote.service.RandomUserService
import com.example.random_user.features.randomuser.data.repository.RandomUserRepositoryImpl
import com.example.random_user.features.randomuser.domain.repository.IRandomUserRepository
import com.example.random_user.features.randomuser.domain.usecase.GetRandomUserUseCase
import com.example.random_user.features.randomuser.navigation.RandomUserNavigationImpl
import com.example.random_user.features.randomuser.presentation.viewmodel.RandomUserViewModel
import com.example.random_user.navigation.randomuser.RandomUserNavigation
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

object RandomUserModule {
    val module = module {

        factory<RandomUserNavigation> { RandomUserNavigationImpl() }

        factory<IRandomUserRepository> {
            RandomUserRepositoryImpl(
                service = get<Retrofit>().create(RandomUserService::class.java)
            )
        }
        factory { GetRandomUserUseCase(repository = get()) }

        viewModel { RandomUserViewModel(useCase = get()) }
    }
}