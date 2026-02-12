package com.example.monapp.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.monapp.ui.theme.Pink80
import com.example.monapp.ui.theme.PurpleGrey40


@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun MyLazyColumn() {

    LazyColumn(

        contentPadding = PaddingValues(all = 10.dp),
        verticalArrangement = Arrangement
            .spacedBy(10.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)

    ) {
        items(count = 30){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Pink80
                )
            ) {

            }
        }
    }

}

@Composable
fun Color(x0: Int) {
    TODO("Not yet implemented")
}