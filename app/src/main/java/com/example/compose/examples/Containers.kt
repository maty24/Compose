package com.example.compose.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


//Columnas que van para abajo
@Composable
fun MyColumns() {
    //la columna es como un contedor de composables
    Column {
        Text(text = "Mati el pulento 10")
        Text(text = "Mati el pulento 11")
        Text(text = "Mati el pulento 12")
    }
}

//Rows que van a la derecha
@Composable
fun MyRows() {
    Row {
        Button(onClick = { /*TODO*/ }) {

        }
        Button(onClick = { /*TODO*/ }) {

        }
        Button(onClick = { /*TODO*/ }) {

        }
    }
}


//Box
@Composable
fun MyBox() {
    Box(
        //el contentAlignment es para alinear el contenido horizontalmente o verticalmente.
        //Sólo se puede aplicar a elementos de la interfaz de usuario que tengan un tamaño definido, como un Box o un Column.
        contentAlignment = Alignment.BottomStart,
        //el modifier es para modificar el comportamiento o la apariencia de un elemento de la interfaz de usuario
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(text = " MATI EL PULENTO 10")
    }
}