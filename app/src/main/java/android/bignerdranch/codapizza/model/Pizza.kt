package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.model.ToppingPlacement.All
import android.bignerdranch.codapizza.model.ToppingPlacement.Left
import android.bignerdranch.codapizza.model.ToppingPlacement.Right
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap(),
    val size: Size = Size.Large
) : Parcelable {
    val price: Double
        get() = priceOfSize(size) + toppings.asSequence()
            .sumOf { (_, toppingPlacement) ->
                when (toppingPlacement) {
                    Left, Right -> 0.5
                    All -> 1.0
                }
            }
    fun withTopping(topping: Topping, placement: ToppingPlacement?): Pizza {
        return copy(
            toppings = if (placement == null) {
                toppings - topping
            } else {
                toppings + (topping to placement)
            }
        )
    }

    private fun priceOfSize(size: Size) = when(size){
        Size.Small -> 7.99
        Size.Medium -> 9.99
        Size.Large -> 14.99
        Size.ExtraLarge -> 19.99
    }
}
