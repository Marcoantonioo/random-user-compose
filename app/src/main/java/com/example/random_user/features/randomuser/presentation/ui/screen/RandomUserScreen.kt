package com.example.random_user.features.randomuser.presentation.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.example.random_user.features.randomuser.presentation.model.RandomUserEvent
import com.example.random_user.features.randomuser.presentation.ui.components.UserList
import com.example.random_user.features.randomuser.presentation.viewmodel.RandomUserViewModel

@Composable
fun RandomUserScreen(viewModel: RandomUserViewModel) {
    val state = viewModel.state.collectAsState()
    UserList(list = state.value.users) {
        viewModel.dispatchEvent(RandomUserEvent.DeleteUser(it))
    }

}