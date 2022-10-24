package com.example.random_user.features.randomuser.data.remote.entity

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("results") val results: List<UserResponse>?
)
