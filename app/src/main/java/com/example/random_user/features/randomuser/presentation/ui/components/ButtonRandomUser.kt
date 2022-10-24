package com.example.random_user.features.randomuser.presentation.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.random_user.features.randomuser.presentation.model.RandomUserEvent
import com.example.random_user.features.randomuser.presentation.ui.theme.Purple700
import com.example.random_user.features.randomuser.presentation.viewmodel.RandomUserViewModel

@Composable
fun RandomUserButton (viewModel: RandomUserViewModel) {
    val state = viewModel.state.collectAsState()
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Purple700),
        onClick = {
            viewModel.dispatchEvent(RandomUserEvent.GetRandomUser)
        }) {
        if (state.value.isLoading) {
           CircularProgressIndicator(
               strokeWidth = 1.dp,
               color = Color.White
           )
        } else {
            Text(
                text = "Generate new user",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp
                )
            )
        }
    }
}