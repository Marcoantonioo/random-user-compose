package com.example.random_user.feature.randomuser.domain.usecase

import app.cash.turbine.test
import com.example.random_user.feature.randomuser.utils.TestUtils
import com.example.random_user.features.randomuser.domain.repository.IRandomUserRepository
import com.example.random_user.features.randomuser.domain.usecase.GetRandomUserUseCase
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.time.ExperimentalTime

@ExperimentalTime
class GetRandomUserUseCaseTest {
    private val repository: IRandomUserRepository = mockk()
    private val usecase = GetRandomUserUseCase(repository = repository)

    @Test
    fun `GetRandomUserUseCase should return a User when success`() = runBlocking {
        val user = Result.success(TestUtils.getDefaultUser())
        every { usecase() } returns flow { emit(user) }

        val result = usecase()

        result.test {
            assertEquals(user, awaitItem())
            awaitComplete()
        }
    }
}