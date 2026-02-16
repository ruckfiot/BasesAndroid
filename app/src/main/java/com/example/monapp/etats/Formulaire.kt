package com.example.monapp.etats

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.monapp.ui.theme.PurpleGrey40

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun Formulaire() {

    var text by rememberSaveable() {
        mutableStateOf("yyyy")
    }
    var onTextChange = { newText : String ->
        text = newText
    }
    var check by rememberSaveable() {
        mutableStateOf(value = false)
    }
    var onCheckChange = { newCheck : Boolean ->
        check = newCheck
    }
    var checkRadio by rememberSaveable() {
        mutableStateOf(value = false)
    }
    var onCheckRadioChange = { newCheckRadio : Boolean ->
        checkRadio = newCheckRadio
    }


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)
    ) {
        TextField(
            value = text,
            onValueChange = onTextChange
        )

        Checkbox(
            checked = check,
            onCheckedChange = onCheckChange
        )

        Switch(
            checked = check,
            onCheckedChange = onCheckChange
        )

        RadioButton(
            selected = checkRadio,
            onClick = {
                checkRadio = !checkRadio
            }
        )
    }
}