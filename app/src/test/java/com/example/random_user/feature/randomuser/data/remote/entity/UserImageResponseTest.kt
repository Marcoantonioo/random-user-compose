package com.example.random_user.feature.randomuser.data.remote.entity

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class UserImageResponseTest {
    @Test
    fun `UserImageResponse should success mapper to  UserImage (Domain)`() {
        val entity = TestUtils.getUserImageResponse()

        val (large, medium, thumbnail) = entity

        val result = entity.toDomain()

        result.run {
            assertEquals(large, large)
            assertEquals(medium, medium)
            assertEquals(thumbnail, thumbnail)
        }
    }
}