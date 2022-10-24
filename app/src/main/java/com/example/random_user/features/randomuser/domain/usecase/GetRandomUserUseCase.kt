package com.example.random_user.features.randomuser.domain.usecase

import com.example.random_user.features.randomuser.domain.model.User
import com.example.random_user.features.randomuser.domain.repository.IRandomUserRepository
import kotlinx.coroutines.flow.Flow

class GetRandomUserUseCase(
    private val repository: IRandomUserRepository
) {
    operator fun invoke(): Flow<Result<User?>> {
        return repository.getRandomUser()
    }
}