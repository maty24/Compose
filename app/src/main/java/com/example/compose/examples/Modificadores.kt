package com.example.compose.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@Composable
fun MyModifiers(){

    Column {
        Text(
            text = "Hello",
            color = Color.Red,
            fontSize = 30.sp,
        )
    }
}