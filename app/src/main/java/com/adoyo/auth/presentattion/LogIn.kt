package com.adoyo.auth.presentattion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adoyo.auth.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.spotify),
                    contentDescription = stringResource(
                        id = R.string.spotify_logo
                    ),
                    modifier = Modifier
                        .size(60.dp)
                        .alpha(0.9f)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Spotify",
                    style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold)
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedTextField(value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(16.dp)
                    ),
                placeholder = {
                    Text(
                        text = "Email address or username",
                        modifier = Modifier.padding(horizontal = 36.dp),
                        style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 20.sp, color = Color.Black.copy(alpha = 0.5f))
                    )
                })
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedTextField(value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(16.dp)
                    ),
                placeholder = {
                    Text(
                        text = "password",
                        modifier = Modifier.padding(horizontal = 106.dp),
                        style = TextStyle(fontWeight = FontWeight.Medium,fontSize = 20.sp, color = Color.Black.copy(alpha = 0.5f))
                    )
                })

            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "LOG IN",
                    style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "Or continue with")
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = stringResource(
                        id = R.string.facebook
                    ),
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = stringResource(
                        id = R.string.google
                    ),
                    modifier = Modifier.size(50.dp)
                )
            }
            Spacer(modifier = Modifier.height(32.dp))

            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Forgot your password")
            }
        }
    }
}

@Preview(device = "id:pixel_7_pro", backgroundColor = 0xFFFFFFFF, showSystemUi = true)
@Composable
fun LonInPreview() {
    LogIn()
}