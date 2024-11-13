package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class Topping(
    @StringRes val toppingName: Int,
    @DrawableRes val pizzaOverlayImage: Int
) {
    Basil(
        toppingName = R.string.topping_basil,
        pizzaOverlayImage = R.drawable.topping_basil
    ),
    Mushroom(
        toppingName = R.string.topping_mushroom,
        pizzaOverlayImage = R.drawable.topping_mushroom
    ),
    Olive(
        toppingName = R.string.topping_olive,
        pizzaOverlayImage = R.drawable.topping_olive
    ),
    Peppers(
        toppingName = R.string.topping_peppers,
        pizzaOverlayImage = R.drawable.topping_peppers
    ),
    Pepperoni(
        toppingName = R.string.topping_pepperoni,
        pizzaOverlayImage = R.drawable.topping_pepperoni
    ),
    Pineapple(
        toppingName = R.string.topping_pineapple,
        pizzaOverlayImage = R.drawable.topping_pineapple
    )
}