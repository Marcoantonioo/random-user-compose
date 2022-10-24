package com.example.random_user.features.randomuser.presentation.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.random_user.R
import com.example.random_user.features.randomuser.presentation.model.UserView
import com.example.random_user.features.randomuser.presentation.ui.theme.Purple200
import com.example.random_user.features.randomuser.presentation.ui.theme.backgroundCard

@Composable
fun UserRow(user: UserView) {
    Box(modifier = Modifier.padding(16.0.dp)) {
        Card(
            shape = RoundedCornerShape(8.0.dp),
            backgroundColor = backgroundCard,
        ) {
            Column(
                modifier = Modifier
                    .padding(10.0.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "FullName:",
                            style = MaterialTheme.typography.h6.copy(fontSize = 16.0.sp),
                            color = Color.Black
                        )
                        Text(
                            text = user.fullName ?: "--",
                            style = MaterialTheme.typography.h6,
                            color = Color.Gray
                        )
                    }
                    AsyncImage(
                        model = user.picture?.large,
                        placeholder = painterResource(R.drawable.ic_launcher_background),
                        contentDescription = "user photo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(75.dp)
                            .clip(CircleShape)
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Email:",
                        style = MaterialTheme.typography.h6.copy(fontSize = 14.0.sp),
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 12.dp),
                    )
                    Text(
                        text = user.email ?: "--",
                        style = MaterialTheme.typography.body2,
                        maxLines = 3,
                        color = Purple200,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Id:",
                        style = MaterialTheme.typography.h6.copy(fontSize = 14.0.sp),
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 12.dp),
                    )
                    Text(
                        text = "${user.userId?.name} ${user.userId?.value}",
                        style = MaterialTheme.typography.body2,
                        maxLines = 3,
                        color = Purple200,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}