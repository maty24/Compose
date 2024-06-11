package com.example.compose.examples

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp



@Composable
fun TextComponent() {
    Text(
        text = "Colo-Colo",
        color = Color.Red,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold, //esto es negrita
        fontStyle = FontStyle.Italic, // el font family es el tipo de letra
        letterSpacing = 2.sp, // espacio entre letras
        textDecoration = TextDecoration.Underline, // subrayado
        modifier = Modifier.fillMaxWidth(),
        maxLines = 1, // cantidad de lineas
        softWrap = true, // el softwrap es para que se ajuste al tamaño del contenedor, cortando la palabra,
        overflow = TextOverflow.Clip // overflow es para que se muestre el texto completo


    )
}


@Preview
@Composable
fun TextComponentPreview() {
    TextComponent()
}
