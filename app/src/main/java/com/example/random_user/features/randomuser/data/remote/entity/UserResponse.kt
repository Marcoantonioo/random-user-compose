package com.example.random_user.features.randomuser.data.remote.entity

import com.example.random_user.features.randomuser.domain.model.User
import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("gender") val gender: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("name") val name: UserNameResponse?,
    @SerializedName("id") val userId: UserIdResponse?,
    @SerializedName("picture") val picture: UserImageResponse?
) {
    fun toDomain() = User(
        gender = this.gender,
        email = this.email,
        name = this.name?.toDomain(),
        userId = this.userId?.toDomain(),
        picture = this.picture?.toDomain()
    )
}
