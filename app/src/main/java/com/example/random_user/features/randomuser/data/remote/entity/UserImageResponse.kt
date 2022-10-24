package com.example.random_user.features.randomuser.data.remote.entity

import com.example.random_user.features.randomuser.domain.model.UserImage
import com.google.gson.annotations.SerializedName

data class UserImageResponse(
    @SerializedName("large") val large: String?,
    @SerializedName("medium") val medium: String?,
    @SerializedName("thumbnail") val thumbnail: String?
) {
    fun toDomain() = UserImage(
        large = this.large,
        medium = this.medium,
        thumbnail = this.thumbnail
    )
}