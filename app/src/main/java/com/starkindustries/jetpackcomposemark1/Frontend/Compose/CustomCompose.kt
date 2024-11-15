package com.starkindustries.jetpackcomposemark1.Frontend.Compose
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposemark1.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
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
            .padding(10.dp, 20.dp, 10.dp, 0.dp),
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
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 200.dp))
}

@Composable
fun CircularImamge(imageId:Int,modifier: Modifier){
    Image(painter = painterResource(id = imageId), contentDescription =null,
        modifier = modifier
            .clickable { }
            .size(100.dp)
            .border(2.dp, Color.Black, CircleShape)
            .clip(CircleShape)
            .background(Color.White)
    )
}

@Composable
fun RowCompose(imageId:Int,username:String){
    Row(modifier = Modifier
        .padding(5.dp)
        .border(2.dp, Color.Black, RectangleShape)
        .fillMaxWidth()
        .background(Color.Gray)
    ) {
        CircularImamge(imageId = imageId,
            Modifier
                .padding(10.dp)
                .align(Alignment.CenterVertically))
        Text(text = username,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .padding(10.dp, 0.dp, 0.dp, 0.dp),
            fontSize = 20.sp)
    }
}

@Composable
fun ColumnCompose(){
Column(modifier = Modifier.verticalScroll(rememberScrollState())
) {
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )
    UserCompose(imageId = R.drawable.batman, username = "kelaskaraditya1", sid ="2021FHCO042" )


}
}

@Composable
fun UserCompose(imageId:Int,username:String,sid:String){
    Row(modifier = Modifier
        .padding(5.dp)
        .fillMaxWidth().
            background(Color.LightGray)
        .border(2.dp, Color.Black, RoundedCornerShape(10.dp))
        .padding(10.dp)){
        CircularImamge(imageId = imageId, modifier = Modifier)
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text = username,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 0.dp, 15.dp, 0.dp),
                textAlign = TextAlign.Center,
                fontSize = 23.sp,
                fontWeight = FontWeight.SemiBold)
            Text(text = sid,
                fontSize = 17.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W500
                )
        }
    }
}

@Composable
fun MainComposible(){
    ImageCompose(imageId = R.drawable.batman,Modifier)
    TextCompose(text = "Aditya",Modifier)
    ButtonCompose()
    TextFieldCompose()
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewFunction(){
    ColumnCompose()
}
