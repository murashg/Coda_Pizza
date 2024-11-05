package android.bignerdranch.codapizza

import android.bignerdranch.codapizza.model.Topping
import android.bignerdranch.codapizza.model.ToppingPlacement
import android.bignerdranch.codapizza.ui.PizzaBuilderScreen
import android.bignerdranch.codapizza.ui.ToppingCell
import android.bignerdranch.codapizza.ui.theme.CodaPizzaTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodaPizzaTheme {
                PizzaBuilderScreen()
            }
        }
    }
}