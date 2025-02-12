package se.magictechnology.pia13android12feb

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProductList(goDetail : (gofruit : Fruit) -> Unit, goAbout : () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Product list")

        Button(onClick = {
            goDetail(Fruit(fruitname = "Bananas"))
        }) {
            Text("GO BANANAS")
        }

        Button(onClick = {
            goDetail(Fruit(fruitname = "Oranges"))
        }) {
            Text("GO ORANGES")
        }

        Button(onClick = {
            goAbout()
        }) {
            Text("About the app")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun ProductListPreview() {
    ProductList(goDetail = {}, goAbout = {})
}