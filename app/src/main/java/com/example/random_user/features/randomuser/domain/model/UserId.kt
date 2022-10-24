package com.example.random_user.features.randomuser.domain.model

import com.example.random_user.features.randomuser.presentation.model.UserIdView

data class UserId(
    val name: String?,
    val value: String?
) {
    fun toView() = UserIdView(
        name = this.name,
        value = this.value
    )
}
