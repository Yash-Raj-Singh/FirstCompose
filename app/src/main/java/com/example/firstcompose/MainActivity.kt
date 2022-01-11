package com.example.firstcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.ui.theme.FirstComposeTheme
import com.example.firstcompose.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //MODIFIERS - Always work Sequentially

            Column(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxHeight(0.5f)
                    .width(600.dp)
                    //.requiredWidth(600.dp)
                    .border(5.dp, color = Color.LightGray)
                    .padding(5.dp)
                    .border(5.dp, color = Color.Black)
                    .padding(5.dp)
                    .border(5.dp, color = Color.White)
                    .padding(10.dp)
            ) {
                Text(text = "Yash", modifier = Modifier.offset(50.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Raj")
                Text(text = "Hi", modifier = Modifier.clickable {
                    Toast.makeText(this@MainActivity,"Button Clicked!", Toast.LENGTH_SHORT).show()
                })
                Text(text = "There",
                    modifier = Modifier.border(5.dp, color = Color.Red)
                        .padding(5.dp)
                        .border(5.dp, color = Color.Gray)
                        .offset(10.dp, 10.dp)
                        .border(5.dp, color = Color.Yellow)
                        .padding(10.dp)
                )
            }
        }
    }
}