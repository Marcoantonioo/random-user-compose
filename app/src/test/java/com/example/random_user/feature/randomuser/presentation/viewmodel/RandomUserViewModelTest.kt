package com.example.random_user.feature.randomuser.presentation.viewmodel

import app.cash.turbine.test
import com.example.random_user.feature.randomuser.commom.MainDispatcherRule
import com.example.random_user.feature.randomuser.utils.TestUtils
import com.example.random_user.features.randomuser.domain.usecase.GetRandomUserUseCase
import com.example.random_user.features.randomuser.presentation.model.RandomUserEvent
import com.example.random_user.features.randomuser.presentation.model.RandomUserState
import com.example.random_user.features.randomuser.presentation.viewmodel.RandomUserViewModel
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class RandomUserViewModelTest {

    private lateinit var viewModel: RandomUserViewModel
    private val useCase: GetRandomUserUseCase = mockk()

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    @Before
    fun setup() {
        createViewModel()
    }

    private fun createViewModel() {
        viewModel = RandomUserViewModel(useCase = useCase)
    }

    @Test
    fun `dispatch event GetRandomUser should get random user`() = runTest {
        val user = Result.success(TestUtils.getDefaultUser())

        every { useCase() } returns flow { emit(user) }

        viewModel.dispatchEvent(RandomUserEvent.GetRandomUser)

        advanceUntilIdle()

        viewModel.state.test {
            val item = awaitItem().users.first()
            assertEquals(user.getOrNull()?.toView(), item)
        }
    }

    @Test
    fun `dispatch event DeleteUser should remove user from a list`() = runTest {
        val user = Result.success(TestUtils.getDefaultUser())
        val idToRemove = "Email"

        every { useCase() } returns flow { emit(user) }

        viewModel.run {
            // get a user
            dispatchEvent(RandomUserEvent.GetRandomUser)

            advanceUntilIdle()

            // remove user
            dispatchEvent(RandomUserEvent.DeleteUser(idToRemove))

            state.test {
                val isListEmpty = awaitItem().users.isEmpty()
                assertTrue(isListEmpty)
            }
        }
    }

    @Test
    fun `init should have the correct state`() {
        val initialState = RandomUserState()
        val currentState = viewModel.state.value

        createViewModel()

        assertEquals(currentState, initialState)
    }
}