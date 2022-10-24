package com.example.random_user.feature.randomuser.presentation.model

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class UserImageViewTest {
    @Test
    fun `UserImageView should success mapper from UserImage (Domain)`() {
        val entity = TestUtils.getUserImageResponse().toDomain()

        val (large, medium, thumbnail) = entity

        val result = entity.toView()

        result.run {
            assertEquals(large, large)
            assertEquals(medium, medium)
            assertEquals(thumbnail, thumbnail)
        }
    }
}