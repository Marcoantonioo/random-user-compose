package com.example.random_user.feature.randomuser.presentation.model

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class UserNameViewTest {
    @Test
    fun `UserNameView should success mapper from UserName (Domain)`() {
        val entity = TestUtils.getUserNameResponse().toDomain()

        val (name) = entity

        val result = entity.toView()

        result.run {
            assertEquals(name, name)
        }
    }
}