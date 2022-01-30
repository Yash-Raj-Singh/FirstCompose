package com.example.firstcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
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

            var sizeState by remember{ mutableStateOf(200.dp)}

            val size by animateDpAsState(
                targetValue = sizeState,

                tween(1000)

//                tween(
//                    500,
//                    250,
//                    easing = LinearOutSlowInEasing
//                )

//            spring(
//                Spring.DampingRatioHighBouncy
//            )

//                keyframes {
//                    durationMillis = 5000
//
//                    sizeState at 0 with LinearEasing
//                    sizeState * 1.5f at 1000 with FastOutLinearInEasing
//                    sizeState * 2f at 5000
//                }
            )

            val infiniteTransition = rememberInfiniteTransition()

            val color by infiniteTransition.animateColor(
                initialValue = Color.Cyan,
                targetValue = Color.Red,
                animationSpec = infiniteRepeatable(
                    tween(2000),
                    repeatMode = RepeatMode.Reverse
                )
            )

            Box(modifier = Modifier
                .size(size)
                .background(color),
            contentAlignment = Alignment.Center){
                Button( onClick = {
                    sizeState += 30.dp
                }) {
                    Text(text = "Zoom it!")
                }
            }
        }
    }
}