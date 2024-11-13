package android.bignerdranch.codapizza.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap(),
    val size: Size = Size.Large
) : Parcelable {
    val price: Double
        get() = size.price + toppings.asSequence()
            .sumOf { (topping, toppingPlacement) ->
                toppingPlacement.price * topping.price
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

    fun setSize(dropDownSizeSelect: Size): Pizza {
        return copy(
            size = dropDownSizeSelect
        )
    }

    fun clearPizza(): Pizza {
        return Pizza()
    }
}
