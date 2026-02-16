package com.example.monapp.etats

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.monapp.ui.theme.PurpleGrey40

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun Increment() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)
    ) {
        Text(
            text = "Hola",
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )

            ) {
                Text(
                    text = "Decrement",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )

            ) {
                Text(
                    text = "Increment",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
        }

    }
}