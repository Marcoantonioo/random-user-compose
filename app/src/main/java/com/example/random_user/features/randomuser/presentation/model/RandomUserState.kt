package com.example.random_user.features.randomuser.presentation.model

data class RandomUserState(
    val isLoading: Boolean = false,
    val users: List<UserView> = emptyList(),
    val error: String? = null
)
