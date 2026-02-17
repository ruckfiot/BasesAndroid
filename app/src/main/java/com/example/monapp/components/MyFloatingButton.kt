package com.example.monapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MyFloatingButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color.Green,
        contentColor = Color.Red
    ) {
        Icon(
            imageVector = Icons.Default.ShoppingCart,
            contentDescription = null
        )
    }
}