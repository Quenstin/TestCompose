package com.quention.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quention.testcompose.ui.theme.TestComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold {
                Column {
                    TopAppBar {
                        Text(text = "kkk", textAlign = TextAlign.Center)
                    }
                    TestContent()
                }


            }
        }
    }
}

@Preview
@Composable
fun TestContent() {
    val inputValue = remember {
        mutableStateOf("")
    }
    Column {
        Text(text = "hello", Modifier.padding(bottom = 8.dp))
        OutlinedTextField(
            value = inputValue.value,
            onValueChange = { inputValue.value = it },
            label = { Text(text = "请输入用户名", fontSize = 14.sp) })
    }
}


@Composable
fun Greeting(name: String) {

    val style = Modifier.background(color = Color.Black)
    Column(Modifier.fillMaxWidth()) {
        Button(onClick = { }) {
            Text(text = "222", fontSize = 12.sp)
        }
        Text(
            text = "Hello $name!",
            style,
            color = Color.White,
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestComposeTheme {
        Greeting("A")
    }
}