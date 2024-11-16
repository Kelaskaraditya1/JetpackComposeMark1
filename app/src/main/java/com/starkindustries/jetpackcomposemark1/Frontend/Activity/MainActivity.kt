package com.starkindustries.jetpackcomposemark1.Frontend.Activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.starkindustries.jetpackcomposemark1.Frontend.States.MainCompose
import com.starkindustries.jetpackcomposemark1.Frontend.States.StateCompose
import com.starkindustries.jetpackcomposemark1.ui.theme.JetPackComposeMark1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeMark1Theme {
                StateCompose()
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetPackComposeMark1Theme {
    }
}