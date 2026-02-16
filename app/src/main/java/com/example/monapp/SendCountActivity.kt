package com.example.monapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.monapp.etats.Increment
import com.example.monapp.ui.theme.MonAppTheme
import kotlin.jvm.java

class SendCountActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MonAppTheme {
                Increment(
                    onSendCount = { newCount ->
                        val intent = Intent(this,
                             ReceivedActivity::class.java)
                        intent.putExtra("count", newCount)
                        startActivity(intent)
                    }
                )
            }
        }
    }
}


