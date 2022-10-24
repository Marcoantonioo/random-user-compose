package com.example.random_user.features.randomuser.data.repository

import com.example.random_user.features.randomuser.data.remote.service.RandomUserService
import com.example.random_user.features.randomuser.domain.model.User
import com.example.random_user.features.randomuser.domain.repository.IRandomUserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RandomUserRepositoryImpl(
    private val service: RandomUserService
) : IRandomUserRepository {
    override fun getRandomUser(): Flow<Result<User?>> {
        return flow {
            try {
                val user = service.getRandomUser().results?.firstOrNull()?.toDomain()
                emit(Result.success(user))
            } catch (ex: Exception) {
                emit(Result.failure(Exception("Não foi possível comunicação com a Api")))
            }
        }
    }
}
