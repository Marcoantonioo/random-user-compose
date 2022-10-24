package com.example.random_user.features.randomuser.navigation

import android.content.Context
import android.content.Intent
import com.example.random_user.features.randomuser.presentation.ui.acitivty.RandomUserActivity
import com.example.random_user.navigation.randomuser.RandomUserNavigation

class RandomUserNavigationImpl : RandomUserNavigation {
    override fun navigateToRandomUser(context: Context) {
        context.startActivity(Intent(context, RandomUserActivity::class.java))
    }
}