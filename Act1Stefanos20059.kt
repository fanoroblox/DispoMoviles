package com.example.holamundo.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarrasUI()
        }
    }
}

@Composable
fun BarrasUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFF0A2A42))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFF3CF07C))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFF0A2A42))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(320.dp)
                    .background(Color(0xFF0A2A42))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(320.dp)
                    .background(Color(0xFF3C6DF0))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(320.dp)
                    .background(Color(0xFF0A2A42))
            )
        }
    }
}

@Preview
@Composable
fun PreviewBarrasUI() {
    BarrasUI()
}
