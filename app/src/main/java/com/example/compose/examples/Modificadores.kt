package com.example.compose.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyModifiers() {

    Column(
        modifier = Modifier
            .fillMaxSize()//obtiene el tamaño máximo de la pantalla del dispositivo
            .background(Color.Yellow)


    ) {
        Text(
            text = "Modifiers",
            color = Color.Red,
            fontSize = 30.sp, //el sp es de los textos, scale-pixels
            modifier = Modifier //en el modifier importa el orden de los modificadores
                .background(Color.Green)
                .border( //border en el fondo
                    width = 2.dp,
                    color = Color.Blue
                )
                .padding(10.dp)// el dp es para todo lo demás, density-pixels
                .border( //border ,este se pone en las letras
                    width = 2.dp,
                    color = Color.Blue
                )
                .padding(8.dp)

        )
    }
}

@Preview
@Composable
fun MyModifiersPreview() {
    MyModifiers()
}