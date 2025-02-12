package se.magictechnology.pia13android12feb

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProductDetail(currentfruit : Fruit) {
    Column(modifier = Modifier.fillMaxSize().padding()) {
        Text("Product detail")

        Text(currentfruit.fruitname)
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDetailPreview() {
    ProductDetail(currentfruit = Fruit(fruitname = "Testfrukt"))
}