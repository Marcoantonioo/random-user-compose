package com.example.random_user.features.randomuser.data.remote.service

import com.example.random_user.features.randomuser.data.remote.entity.ApiResponse
import retrofit2.http.GET

interface RandomUserService {
    @GET("api")
    suspend fun getRandomUser() : ApiResponse
}
