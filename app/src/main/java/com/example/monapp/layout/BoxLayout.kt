package com.example.monapp.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.monapp.ui.theme.PurpleGrey40

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable

fun BoxLayout(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)

    ) {

        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Red)
                .align(Alignment.Center)
        )

        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Blue)
                .align(Alignment.CenterEnd)

        )

        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Green)
                .align(Alignment.CenterStart)
        )
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.White)
                .align(Alignment.TopEnd)
        )

        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Magenta)
                .align(Alignment.TopCenter)

        )

        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.DarkGray)
                .align(Alignment.TopStart)
        )
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Yellow)
                .align(Alignment.BottomEnd)
        )

        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Black)
                .align(Alignment.BottomStart)
        )

        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Cyan)
                .align(Alignment.BottomCenter)
        )

    }

}