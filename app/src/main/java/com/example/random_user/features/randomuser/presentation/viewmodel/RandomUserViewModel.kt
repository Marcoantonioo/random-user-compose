package com.example.random_user.features.randomuser.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.random_user.features.randomuser.domain.usecase.GetRandomUserUseCase
import com.example.random_user.features.randomuser.presentation.model.RandomUserEvent
import com.example.random_user.features.randomuser.presentation.model.RandomUserState
import com.example.random_user.features.randomuser.presentation.model.UserView
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class RandomUserViewModel(
    private val useCase: GetRandomUserUseCase
) : ViewModel() {

    private val _state: MutableStateFlow<RandomUserState> = MutableStateFlow(RandomUserState())
    val state: StateFlow<RandomUserState> = _state

    fun dispatchEvent(event: RandomUserEvent) {
        when (event) {
            is RandomUserEvent.GetRandomUser -> {
                getRandomUser()
            }
            is RandomUserEvent.DeleteUser -> {
                deleteUser(event.id)
            }
        }
    }

    private fun deleteUser(id: String) {
        val actualList = _state.value.users.toMutableList().also { list ->
            list.removeAll { it.email == id }
        }

        _state.value = _state.value.copy(
            users = actualList.toList()
        )
    }

    private fun getRandomUser() {
        viewModelScope.launch {
            useCase().onStart {
                onStart()
            }.onCompletion {
                onCompletion()
            }.collect { res ->
                res.exceptionOrNull()?.message?.let {
                    onError(it)
                } ?: onSuccess(res.getOrNull()?.toView())
            }
        }
    }

    private fun onError(error: String) {
        _state.value = _state.value.copy(isLoading = true, error = error)
    }

    private fun onStart() {
        _state.value = _state.value.copy(isLoading = true)
    }

    private fun onCompletion() {
        _state.value = _state.value.copy(isLoading = false)
    }

    private fun onSuccess(user: UserView?) {
        user?.let {
            _state.value = _state.value.copy(
                users = mutableListOf<UserView>().apply {
                    addAll(_state.value.users)
                    add(it)
                }
            )
        }
    }
}
