package com.example.l5_ex1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.l5_ex1.ui.theme.L5_EX1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            L5_EX1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Counter_in_Row()
                }
            }
        }
    }
}

@Composable
fun Counter_row() {
    var text by remember { mutableStateOf("Hello") }
    var number by remember { mutableStateOf(0)}
   Row (
       modifier = Modifier.fillMaxWidth(),
       horizontalArrangement = Arrangement.Center,
       verticalAlignment = Alignment.CenterVertically)
   {
       Button(onClick = { number++ }) {
           Text("+")
       }
       Spacer(modifier = Modifier.width(15.dp))
       Button(onClick = { number-- }) {
           Text("-")
       }
       Spacer(modifier = Modifier.width(15.dp))
       TextField(
           value = number.toString(),
           onValueChange = { newValue ->
               number = newValue.toIntOrNull() ?:0
           },
           label = { Text("Label") })


   }
}
@Composable
fun Counter_in_Row(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center){
        Counter_row()
        Counter_row()
        Counter_row()
    }
}


@Preview(showBackground = true)
@Composable
fun Counter_row_preview() {
    Counter_in_Row()

}