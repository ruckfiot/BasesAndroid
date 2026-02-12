package com.example.monapp.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.monapp.ui.theme.Pink80
import com.example.monapp.ui.theme.PurpleGrey40

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun MyLazyVerticalGrid(modifier: Modifier = Modifier) {

    LazyVerticalGrid(

        contentPadding = PaddingValues(all = 10.dp),
        verticalArrangement = Arrangement
            .spacedBy(10.dp),
        horizontalArrangement = Arrangement
            .spacedBy(10.dp),
        columns = GridCells.Fixed(count = 2),
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)

    ) {

        items(count = 50){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Pink80
                )
            ) {

            }
        }

    }

}