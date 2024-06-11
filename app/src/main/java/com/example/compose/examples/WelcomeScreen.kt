package com.example.compose.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#FFC107"))),
        contentAlignment = Alignment.Center //el content alignment es para centrar el contenido

    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally //alineacion horizontal
        ) {
            Text(
                text = "Mati el pulento 10",
                color = Color.Blue,
                fontSize = 28.sp, //tamaño de la fuente
                fontWeight = FontWeight.Medium //grosor de la fuente
            )
            Text(
                text = "Mati el developer del colo",
                color = Color.Green,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Divider(thickness = 1.dp, color = Color.Black)
            Row(
                modifier = Modifier.padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Favorite",
                    tint = Color.Red,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Mati el pulento 10",
                    color = Color.Blue, fontSize = 28.sp,
                    fontWeight = FontWeight.Medium
                )

            }
        }
        Divider(thickness = 1.dp, color = Color.Black)

    }
}


@Preview
@Composable
fun WelcomeCardPreview() {
    WelcomeCard()
}