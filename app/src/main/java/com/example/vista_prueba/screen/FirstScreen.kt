package com.example.vista_prueba.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.vista_prueba.navigation.AppScreen

@Composable
fun FirstScreen(navController: NavController) {
    BodyContent(navController)
}

@Composable
fun BodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hola, Esta es la primera pantalla")
        Button(onClick = {
           navController.navigate(route = AppScreen.SecondScreen.route)
        }) {
            Text(text = "ir a la segunda")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    val navController = rememberNavController() // Simulando un NavController
    FirstScreen(navController)
}
