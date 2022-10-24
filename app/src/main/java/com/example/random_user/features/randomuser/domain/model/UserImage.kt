package com.example.random_user.features.randomuser.domain.model

import com.example.random_user.features.randomuser.presentation.model.UserImageView

data class UserImage(
    val large: String?,
    val medium: String?,
    val thumbnail: String?
) {
    fun toView() = UserImageView(
        large = this.large,
        medium = this.medium,
        thumbnail = this.thumbnail
    )
}