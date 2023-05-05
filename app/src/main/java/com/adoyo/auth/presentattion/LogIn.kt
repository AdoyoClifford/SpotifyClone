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
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
            OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "LOG IN",
                    style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold)
                )
            }
        }
    }
}

@Preview
@Composable
fun LonInPreview() {
    LogIn()
}