package com.example.firstcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

           //HARD CODING LIST

//            val scrollState = rememberScrollState()
//            Column(
//                modifier = Modifier.verticalScroll(scrollState)
//            ) {
//                for (i in 1..500)
//                {
//                    Text(
//                        text = "Item $i",
//                        fontSize = 25.sp,
//                        color = Color(0xFFb56576),
//                        fontWeight = FontWeight.SemiBold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(15.dp)
//                    )
//                }
//            }


            //USING LAZY-COLUMN

//            LazyColumn{
//                items(5000) {
//                    Text(
//                        text = "Item $it",
//                        fontSize = 25.sp,
//                        color = Color(0xFFb56576),
//                        fontWeight = FontWeight.SemiBold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(15.dp)
//                    )
//                }
//            }

            //USING LAZY-COLUMN TO SHOW ITEMS OF A LIST ( list can be of anything )

            LazyColumn{
                itemsIndexed(
                    listOf("Hi","There","I","Am","Yash")
                ) { index, string->
                    Text(
                        text = string,
                        fontSize = 25.sp,
                        color = Color(0xFFb56576),
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    )
                }
            }
        }
    }
}