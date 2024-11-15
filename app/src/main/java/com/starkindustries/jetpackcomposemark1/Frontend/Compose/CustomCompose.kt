package com.starkindustries.jetpackcomposemark1.Frontend.Compose
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposemark1.R
import kotlin.coroutines.coroutineContext

@Composable
fun TextCompose(text:String,modifier: Modifier){
    Text(text = "I am $text",
        modifier = modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontSize = 18.sp,
        fontWeight = FontWeight.W500,
        fontFamily = FontFamily.SansSerif
    )
}

@Composable
fun ImageCompose(imageId:Int,modifier: Modifier){
    Image(painter= painterResource(id = imageId), contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp, 20.dp,10.dp,0.dp),
        colorFilter = ColorFilter.tint(Color.Red)
    )
}

@Composable
fun ButtonCompose(){
Button(onClick = {

},
    modifier = Modifier
        .fillMaxWidth()
        .padding(100.dp, 100.dp, 100.dp, 0.dp),
    colors = ButtonDefaults.buttonColors(
        containerColor =Color.LightGray ,
        contentColor =Color.Black
    )
) {
    TextCompose(text = "Ironman", modifier = Modifier)
}
}

@Composable
fun TextFieldCompose(){
    var state = remember {
        mutableStateOf("")
    }
    TextField(value = state.value, onValueChange = {
        state.value=it
    }, label = {
        TextCompose(text = "Enter Name", modifier = Modifier)
    },
        modifier = Modifier.fillMaxWidth().
    padding(0.dp,200.dp))
}
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewFunction(){
    ImageCompose(imageId = R.drawable.batman,Modifier)
    TextCompose(text = "Aditya",Modifier)
    ButtonCompose()
    TextFieldCompose()
}