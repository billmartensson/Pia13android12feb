package se.magictechnology.pia13android12feb

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun AboutScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "About Screen", fontSize = 50.sp)
        Text(text = "This is a very good app")
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}