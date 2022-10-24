package com.example.random_user.features.randomuser.presentation.model

sealed class RandomUserEvent {
    object GetRandomUser : RandomUserEvent()
    data class DeleteUser(val id: String) : RandomUserEvent()
}