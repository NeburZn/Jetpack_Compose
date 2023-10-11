package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Contenido()
                }
            }
        }
    }
}


@Composable
fun Contenido(){
    Column {
        Imagen()
        Title(name = stringResource(R.string.titulo_ejercicio))
        Parrafo1(name = stringResource(R.string.parrafo1))
        Parrafo2(name = stringResource(R.string.parrafo2))
    }
}

@Composable
fun Imagen (){
    val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            alignment = Alignment.TopCenter
        )
}


@Composable
fun Title(name: String) {
        Text(
            text = name,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
}

@Composable
fun Parrafo1(name: String) {
    Text(
        text = name,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun Parrafo2(name: String) {
    Text(
        text = name,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun JetpackPreview() {
    JetpackComposeTheme {
        Contenido()
    }
}