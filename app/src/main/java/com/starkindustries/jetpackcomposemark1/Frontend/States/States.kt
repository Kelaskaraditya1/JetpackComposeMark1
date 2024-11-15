package com.starkindustries.jetpackcomposemark1.Frontend.States
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StatesScreen(){
MainCompose()
}

@Composable
fun MainCompose(){
    var count=0
Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center
    ) {
    Text(text = "The current count is:$count ",
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(0.dp, 10.dp, 0.dp, 0.dp),
        fontSize = 20.sp)
    Button(onClick = { count++},
        modifier = Modifier.fillMaxWidth().
        padding(100.dp,10.dp,100.dp,0.dp)) {
        Text(text = "Increment")
    }
}
}