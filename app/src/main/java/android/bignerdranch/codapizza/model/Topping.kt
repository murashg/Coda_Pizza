package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class Topping(
    @StringRes val toppingName: Int,
    @DrawableRes val pizzaOverlayImage: Int,
    val price: Double //per whole pizza
) {
    Basil(
        toppingName = R.string.topping_basil,
        pizzaOverlayImage = R.drawable.topping_basil,
        price = 0.5
    ),
    Mushroom(
        toppingName = R.string.topping_mushroom,
        pizzaOverlayImage = R.drawable.topping_mushroom,
        price = .75
    ),
    Olive(
        toppingName = R.string.topping_olive,
        pizzaOverlayImage = R.drawable.topping_olive,
        price = 0.99


    ),
    Peppers(
        toppingName = R.string.topping_peppers,
        pizzaOverlayImage = R.drawable.topping_peppers,
        price = 0.75
    ),
    Pepperoni(
        toppingName = R.string.topping_pepperoni,
        pizzaOverlayImage = R.drawable.topping_pepperoni,
        price = 1.99
    ),
    Pineapple(
        toppingName = R.string.topping_pineapple,
        pizzaOverlayImage = R.drawable.topping_pineapple,
        price = 0.99
    )
}