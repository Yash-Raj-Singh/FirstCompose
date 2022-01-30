package com.example.firstcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            val scope = rememberCoroutineScope()
            
            Scaffold(scaffoldState = scaffoldState) {
                var counter = produceState(initialValue = 0){
                    delay(3000L)
                    value = 6
                    delay(3000L)
                    value = 10
                    delay(3000L)
                    value = 12
                    delay(3000L)
                    value = 20
                }

                if(counter.value%5 == 0 && counter.value > 0)
                {
                    LaunchedEffect(key1 = scaffoldState){
                        scaffoldState.snackbarHostState.showSnackbar("Hi there, ${counter.value}")
                    }
                }

                Button(onClick = {  })
                {
                    Text(text = "Click Here : ${counter.value}")
                }
            }
        }
    }
}