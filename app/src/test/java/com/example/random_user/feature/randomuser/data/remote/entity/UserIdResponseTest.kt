package com.example.random_user.feature.randomuser.data.remote.entity

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class UserIdResponseTest {
    @Test
    fun `UserIdResponse should success mapper to UserId (Domain)`() {
        val entity = TestUtils.getUserIdResponse()

        val (name, value) = entity

        val result = entity.toDomain()

        result.run {
            assertEquals(name, name)
            assertEquals(value, value)
        }
    }
}