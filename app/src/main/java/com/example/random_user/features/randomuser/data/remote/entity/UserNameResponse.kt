package com.example.random_user.features.randomuser.data.remote.entity

import com.example.random_user.features.randomuser.domain.model.UserName
import com.google.gson.annotations.SerializedName

data class UserNameResponse(
    @SerializedName("title") val title: String?,
    @SerializedName("first") val first: String?,
    @SerializedName("last") val last: String?
) {
    fun toDomain() = UserName(
        title = this.title,
        first = this.first,
        last = this.last
    )
}
