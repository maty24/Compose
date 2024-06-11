package com.example.compose.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ColumnComponent() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally, // horizontal es -
        verticalArrangement = Arrangement.SpaceEvenly // vertical es |
    ){
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.Red)
        ) {

        }
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.Yellow)
        ) {

        }
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.Green)
        ) {

        }
    }
}


@Composable
fun RowComponent() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        horizontalArrangement = Arrangement.SpaceEvenly, // cuandoes horizontal es arragement , en el column es alignment
        verticalAlignment = Alignment.CenterVertically // vertical es alignment , en el column es arragement
    ) {
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.Red)
        ) {

        }
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.Yellow)
        ) {

        }
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .background(Color.Green)
        ) {

        }
    }
}

@Preview
@Composable
fun ColumnComponentPreview() {
    RowComponent()
}