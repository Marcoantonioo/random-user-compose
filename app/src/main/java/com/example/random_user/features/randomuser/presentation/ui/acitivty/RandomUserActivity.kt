package com.example.random_user.features.randomuser.presentation.ui.acitivty

import android.os.Bundle
import android.widget.StackView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.random_user.features.randomuser.presentation.model.RandomUserEvent
import com.example.random_user.features.randomuser.presentation.ui.components.RandomUserButton
import com.example.random_user.features.randomuser.presentation.ui.screen.RandomUserScreen
import com.example.random_user.features.randomuser.presentation.ui.theme.RandomUserTheme
import com.example.random_user.features.randomuser.presentation.viewmodel.RandomUserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class RandomUserActivity : ComponentActivity() {

    private val viewModel: RandomUserViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RandomUserTheme {
                Surface(
                    modifier = Modifier.fillMaxHeight(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        RandomUserButton(viewModel = viewModel)
                        RandomUserScreen(viewModel = viewModel)
                    }
                }
            }
        }
    }
}
