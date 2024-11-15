package com.starkindustries.jetpackcomposemark1.Frontend.Compose
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextCompose(text:String){
    Text(text = "I am $text",
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
        fontSize = 18.sp,
        fontWeight = FontWeight.W300,
        fontFamily = FontFamily.Default
    )
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewFunction(){
    TextCompose(text = "Aditya")
}