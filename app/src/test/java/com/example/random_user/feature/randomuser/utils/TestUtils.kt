package com.example.random_user.feature.randomuser.utils

import com.example.random_user.features.randomuser.data.remote.entity.*

object TestUtils {
    fun getDefaultUser() = getApiResponse().results!!.first().toDomain()

    fun getApiResponse() = ApiResponse(
        results = listOf(getUserResponse())
    )

    fun getUserIdResponse() = UserIdResponse(
        name = "Name",
        value = "Value"
    )

    fun getUserImageResponse() = UserImageResponse(
        large = "Test",
        medium = "Test",
        thumbnail = "Test"
    )

    fun getUserNameResponse() = UserNameResponse(
        title = "Title",
        first = "First",
        last = "Last"
    )

    fun getUserResponse() = UserResponse(
        gender = "Gender",
        email = "Email",
        name = getUserNameResponse(),
        userId = getUserIdResponse(),
        picture = getUserImageResponse()
    )
}