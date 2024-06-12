package com.example.compose.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TextFieldComponent() {
    Column {
        TextField(
            value = "", //el valor que se muestra en el campo de texto
            onValueChange = {}, //cambia el valor del campo de texto
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "ola",
            onValueChange = {},
            label = { // esto adminte un composable


            }
        )
    }
}


@Preview
@Composable
fun TextFieldComponentPreview() {
    TextFieldComponent()
}
