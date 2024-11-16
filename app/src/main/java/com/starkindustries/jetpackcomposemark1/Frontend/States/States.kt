package com.starkindustries.jetpackcomposemark1.Frontend.States
import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StatesScreen(){
StateCompose()
}

@Composable
fun MainCompose(){
    var count= remember {
        mutableStateOf(0)
    }
Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center
    ) {
    Text(text = "The current count is:${count.value} ",
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(0.dp, 10.dp, 0.dp, 0.dp),
        fontSize = 20.sp)
    Button(onClick = { count.value++},
        modifier = Modifier
            .fillMaxWidth()
            .padding(100.dp, 10.dp, 100.dp, 0.dp)) {
        Text(text = "Increment")
    }
}
}

@Composable
fun StateCompose() {
    var count = remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        if (count.value < 5) {
            Text(
                text = "The value of the count is:${count.value}",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
            Button(
                onClick = { count.value++ },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(0.dp, 10.dp, 0.dp, 0.dp)
            ) {
                Text(
                    text = "Increment",
                    fontSize = 15.sp
                )
            }
        } else {
            Text(
                text = "The value of the count has gone out of the limit",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 17.sp
            )
            Button(
                onClick = { count.value=0},
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .padding(20.dp)
            ) {
                Text(text = "Reset",
                    fontSize = 17.sp)
            }

        }
    }
}