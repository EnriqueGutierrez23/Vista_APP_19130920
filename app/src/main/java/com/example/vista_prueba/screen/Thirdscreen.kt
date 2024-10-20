package com.example.vista_prueba.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.vista_prueba.navigation.AppScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(text = "Tercera Pantalla")
            },
            navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack")
                }
            }
        )
    }) { innerPadding ->
        BodyContent3(navController, Modifier.padding(innerPadding))
    }
}

@Composable
fun BodyContent3(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hola, esta es la Tercera pantalla,")
        Text(
            text = "No pude hacer el fork al repositorio " +
                    "ya que cuando lo hacía y lo intentaba abrir " +
                    "no me dejaba correr la aplicación, así que lo hice por mi cuenta.",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center // Cambiado aquí
        )

        Button(onClick = {
            navController.navigate(route = AppScreen.FirstScreen.route)
        }) {
            Text(text = "volver al inicio")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    val navController = rememberNavController()
    ThirdScreen(navController)
}
