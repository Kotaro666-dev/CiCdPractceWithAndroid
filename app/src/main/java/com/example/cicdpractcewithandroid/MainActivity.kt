package com.example.cicdpractcewithandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.cicdpractcewithandroid.ui.theme.CiCdPractceWithAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CiCdPractceWithAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(device = Devices.PIXEL_4_XL, name = "PIXEL_4_XL", showSystemUi = true)
@Preview(device = Devices.NEXUS_5, name = "NEXUS_5", showSystemUi = true)
@Preview(device = Devices.NEXUS_6, name = "NEXUS_6", showSystemUi = true)
@Composable
fun PreviewGreeting() = Greeting(name = "Kotaro")

