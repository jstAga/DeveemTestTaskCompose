package com.deveem.deveemtesttaskcompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.deveem.deveemtesttaskcompose.R

private val robotoBold = FontFamily(Font(R.font.roboto_bold, FontWeight.Bold))
private val robotoRegular = FontFamily(Font(R.font.roboto_regular, FontWeight.Normal))

val Typography = Typography(
  
  bodySmall = TextStyle(
    fontSize = 12.sp,
    fontFamily = robotoRegular,
    color = Color.Black
  ),
  
  bodyLarge = TextStyle(
    fontSize = 14.sp,
    fontFamily = robotoRegular,
    color = Color.Black
  ),
  
  labelLarge = TextStyle(
    fontSize = 16.sp,
    fontFamily = robotoRegular,
    color = Color.Black
  ),
  
  titleSmall = TextStyle(
    fontSize = 18.sp,
    fontFamily = robotoRegular,
    color = Color.Black
  ),
  
  titleMedium = TextStyle(
    fontSize = 20.sp,
    fontFamily = robotoBold,
    color = Color.Black
  ),
  
  headlineSmall = TextStyle(
    fontSize = 24.sp,
    fontFamily = robotoRegular,
    color = Color.Black
  ),
  
  headlineLarge = TextStyle(
    fontSize = 32.sp,
    fontFamily = robotoRegular,
    color = Color.Black
  ),
  
  displaySmall = TextStyle(
    fontSize = 28.sp,
    fontFamily = robotoRegular,
    color = Color.Black
  ),
  
  displayLarge = TextStyle(
    fontSize = 48.sp,
    fontFamily = robotoBold,
    color = Color.Black
  )
)