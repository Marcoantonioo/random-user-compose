package com.example.random_user.feature.randomuser.presentation.model

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class UserIdViewTest {
    @Test
    fun `UserIdView should success mapper from UserId (Domain)`() {
        val entity = TestUtils.getUserIdResponse().toDomain()

        val (name, value) = entity

        val result = entity.toView()

        result.run {
            assertEquals(name, "name")
            assertEquals(value, "name")
        }
    }
}