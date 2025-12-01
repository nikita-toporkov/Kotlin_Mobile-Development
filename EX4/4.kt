package com.example.l4_ex1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l4_ex1.ui.theme.L4_EX1Theme
import java.time.Clock.offset

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            L4_EX1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                BackgroundImage()
                }
            }
        }
    }
}

@Composable
fun BackgroundImage() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_image), // Your drawable
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxSize()
        )
        Column(modifier = Modifier
            .align(Alignment.TopStart)
            .padding(16.dp)) {
            Text(
                text = "Random Company",
                style = TextStyle(
                    fontSize = 32.sp,
                    shadow = Shadow(color = Color.Blue, blurRadius = 3f)),
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif)
            Text(

                text = "sell shirts",
                style = TextStyle(
                    fontSize = 28.sp,
                    shadow = Shadow(color = Color.Blue, blurRadius = 3f)
                ),
                fontFamily = FontFamily.SansSerif)
        }
        Column(modifier = Modifier
            .align(Alignment.BottomEnd)
            .padding(16.dp)){
            Text(
                text = "+358-242-23-46-96",
                style = TextStyle(
                    fontSize = 24.sp,
                    shadow = Shadow(color = Color.Blue, blurRadius = 3f)
                ),
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "club.random@email.com",
                style = TextStyle(
                    fontSize = 28.sp,
                    shadow = Shadow(color = Color.Blue, blurRadius = 3f)
                ),
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    L4_EX1Theme {
        BackgroundImage()
    }
}