package com.example.random_user.features.randomuser.data.remote.entity

import com.example.random_user.features.randomuser.domain.model.UserId
import com.google.gson.annotations.SerializedName

data class UserIdResponse(
    @SerializedName("name") val name: String?,
    @SerializedName("value") val value: String?
) {
    fun toDomain() = UserId(
        name = this.name,
        value = this.value
    )
}
