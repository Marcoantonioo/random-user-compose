package com.example.random_user.feature.randomuser.data.remote.entity

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class UserResponseTest {
    @Test
    fun `UserResponse should success mapper to  User (Domain)`() {
        val entity = TestUtils.getUserResponse()

        val (gender, email, name, userId, picture) = entity

        val result = entity.toDomain()

        result.run {
            assertEquals(gender, gender)
            assertEquals(email, email)
            assertEquals(name, name)
            assertEquals(userId, userId)
            assertEquals(picture, picture)
        }
    }
}