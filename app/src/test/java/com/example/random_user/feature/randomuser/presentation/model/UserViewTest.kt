package com.example.random_user.feature.randomuser.presentation.model

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class UserViewTest {
    @Test
    fun `UserView should success mapper from User (Domain)`() {
        val entity = TestUtils.getUserResponse().toDomain()

        val (gender, email, name, userId, picture) = entity

        val result = entity.toView()

        result.run {
            assertEquals(gender, gender)
            assertEquals(email, email)
            assertEquals(name, name)
            assertEquals(userId, userId)
            assertEquals(picture, picture)
        }
    }
}