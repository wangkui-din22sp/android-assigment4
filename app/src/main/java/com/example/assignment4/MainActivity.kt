package com.example.assignment4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment4.ui.theme.Assignment4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment4Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val appModifier = Modifier.fillMaxWidth().padding(8.dp)
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "Title", style = MaterialTheme.typography.titleLarge, modifier = appModifier)
        OutlinedTextField(
            value = "Hello, World!",
            onValueChange = { /*TODO*/ },
            label = { Text("Label") },
            modifier = appModifier
        )
        Button(onClick = { /*TODO*/ },
            modifier = appModifier) {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Assignment4Theme {
        MyApp()
    }
}