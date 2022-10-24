package com.example.random_user.features.randomuser.presentation.model

data class UserView(
    val gender: String?,
    val email: String?,
    val fullName: String?,
    val userId: UserIdView?,
    val picture: UserImageView?
)