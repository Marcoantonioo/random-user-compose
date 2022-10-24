package com.example.random_user.features.randomuser.presentation.ui.components

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.input.pointer.pointerInput
import com.example.random_user.features.randomuser.presentation.model.UserView

@Composable
fun UserList(list: List<UserView>, onLongPress: (String) -> Unit) {
    LazyColumn {
        items(
            items = list,
            key = {
                    item -> item.email ?: ""
            }
        ) { user ->
            Column(modifier = androidx.compose.ui.Modifier.pointerInput(Unit) {
                detectTapGestures(
                    onLongPress = {
                        user.email?.let {
                            onLongPress.invoke(it)
                        }
                    }
                )
            }) {
                UserRow(user = user)
            }
        }
    }
}