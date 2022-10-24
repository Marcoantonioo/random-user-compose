package com.example.random_user.features.randomuser.domain.model

import com.example.random_user.features.randomuser.presentation.model.UserView

data class User(
    val gender: String?,
    val email: String?,
    val name: UserName?,
    val userId: UserId?,
    val picture: UserImage?
) {
    fun toView() = UserView(
        gender = this.gender,
        email = this.email,
        fullName = this.name?.toView(),
        userId = this.userId?.toView(),
        picture = this.picture?.toView()
    )
}