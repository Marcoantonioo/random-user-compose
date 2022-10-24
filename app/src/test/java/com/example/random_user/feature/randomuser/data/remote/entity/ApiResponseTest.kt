package com.example.random_user.feature.randomuser.data.remote.entity

import com.example.random_user.feature.randomuser.utils.ResultJson
import com.example.random_user.feature.randomuser.utils.TestUtils
import com.example.random_user.features.randomuser.data.remote.entity.ApiResponse
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import org.junit.Assert.assertEquals
import org.junit.Test

class ApiResponseTest {

    @Test
    fun `Json should success mapper to ApiResponse`() {
        val entity = TestUtils.getApiResponse()

        val entityJson = ResultJson.getJson()
        val gson = GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .serializeNulls()
            .create()

        val resultEntity = gson.fromJson(entityJson, ApiResponse::class.java)

        assertEquals(entity.results!!.first(), resultEntity.results!!.first())
    }
}