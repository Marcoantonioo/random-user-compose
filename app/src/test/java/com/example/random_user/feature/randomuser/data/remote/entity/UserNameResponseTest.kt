package com.example.random_user.feature.randomuser.data.remote.entity

import com.example.random_user.feature.randomuser.utils.TestUtils
import org.junit.Assert
import org.junit.Test

class UserNameResponseTest {
    @Test
    fun `UserNameResponse should success mapper to  UserName (Domain)`() {
        val entity = TestUtils.getUserNameResponse()

        val (title, first, last) = entity

        val result = entity.toDomain()

        result.run {
            Assert.assertEquals(title, title)
            Assert.assertEquals(first, first)
            Assert.assertEquals(last, last)
        }
    }
}