package com.example.random_user.features.randomuser.domain.model

data class UserName(
    val title: String?,
    val first: String?,
    val last: String?
) {
    fun toView() = "$title $first $last"
}
