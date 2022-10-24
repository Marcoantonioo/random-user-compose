package com.example.random_user.features.randomuser.domain.repository
import com.example.random_user.features.randomuser.domain.model.User
import kotlinx.coroutines.flow.Flow

interface IRandomUserRepository {
    fun getRandomUser() : Flow<Result<User?>>
}