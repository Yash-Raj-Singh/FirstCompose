package com.example.firstcompose

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.jetbrainsmono_thin, FontWeight.Thin),
            Font(R.font.jetbrainsmono_semibold, FontWeight.SemiBold),
            Font(R.font.jetbrainsmono_regular, FontWeight.Normal),
            Font(R.font.jetbrainsmono_bold, FontWeight.Bold),
            Font(R.font.jetbrainsmono_medium, FontWeight.Medium)
        )
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF4A4875))
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFFC76E49),
                                fontSize = 50.sp,
                                textDecoration = TextDecoration.None,
                                fontWeight = FontWeight.Bold
                            )

                        ){
                                append("J")
                            }
                        append("etpack ")
                        withStyle(
                            style = SpanStyle(
                                color = Color(0xFF771412),
                                fontSize = 50.sp,
                                textDecoration = TextDecoration.None,
                                fontWeight = FontWeight.Bold
                            )
                        ){
                                append("C")
                            }
                        append("ompose")
                    },
                    color = Color(0xFFCFAA99),
                    fontSize = 35.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}