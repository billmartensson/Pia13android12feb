package se.magictechnology.pia13android12feb

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable



@Composable
fun ProductNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "productlist") {

        composable("productlist") { backStackEntry ->
            ProductList(goDetail = { clickedfruit ->
                navController.navigate(route = clickedfruit)
            }, goAbout = {
                navController.navigate("about")
            })
        }

        composable<Fruit> { backStackEntry ->
            val navfruit : Fruit = backStackEntry.toRoute()
            ProductDetail(currentfruit = navfruit)
        }

        composable("about") {
            AboutScreen(letsclose = {
                navController.popBackStack()
            })
        }
    }

}


@Preview(showBackground = true)
@Composable
fun ProductNavPreview() {
    ProductNav()
}