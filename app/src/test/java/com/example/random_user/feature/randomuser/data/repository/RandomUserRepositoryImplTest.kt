package com.example.random_user.feature.randomuser.data.repository

import app.cash.turbine.test
import com.example.random_user.feature.randomuser.utils.TestUtils
import com.example.random_user.features.randomuser.data.repository.RandomUserRepositoryImpl
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

@ExperimentalCoroutinesApi
class RandomUserRepositoryImplTest {
    private var repository: RandomUserRepositoryImpl = mockk()

    @Test
    fun `getRandomUser must return a User (Domain)`() = runBlocking {
        val user = TestUtils.getApiResponse().results!!.first().toDomain()

        every { repository.getRandomUser() } returns flow { emit(Result.success(user)) }

        val result = repository.getRandomUser()

        result.test {
            assertEquals(user, awaitItem().getOrNull())
            awaitComplete()
        }
    }
}