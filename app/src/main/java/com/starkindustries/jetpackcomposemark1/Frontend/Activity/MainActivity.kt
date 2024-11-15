package com.starkindustries.jetpackcomposemark1.Frontend.Activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.starkindustries.jetpackcomposemark1.Frontend.Compose.MainComposible
import com.starkindustries.jetpackcomposemark1.Frontend.Compose.TextCompose
import com.starkindustries.jetpackcomposemark1.ui.theme.JetPackComposeMark1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeMark1Theme {
                MainComposible()
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetPackComposeMark1Theme {
        MainComposible()
    }
}