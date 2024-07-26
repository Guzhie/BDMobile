package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    tela()
                }
            }
        }
    }
}

@Composable
fun tela() {
    var nome=""
    var idade=""

    Column( Modifier
        .background(Color.White)
    ) {
        Row(Modifier
            .padding(20.dp)
        ) {}

        Row( Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "App Database",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        Row(Modifier
            .padding(15.dp)
        ) {}

        Row(Modifier
            .fillMaxWidth(),
            Arrangement.Center)
        {
            TextField(value = nome,
                    onValueChange = {nome = it },
                    label = { Text(text = "Nome")}
                )
        }
        Row(Modifier
            .padding(10.dp)
        ) {}

        Row(Modifier
            .fillMaxWidth(),
            Arrangement.Center)
        {
            TextField(value = idade,
                onValueChange = {idade = it },
                label = { Text(text = "Idade")}
            )
        }

        Row(Modifier
            .padding(20.dp)
        ) {}


        Row(Modifier
                .fillMaxWidth(),
                Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cadastrar")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        tela()
    }
}