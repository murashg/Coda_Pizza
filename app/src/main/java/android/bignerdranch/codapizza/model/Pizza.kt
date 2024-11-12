package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
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
        get() = size.price + toppings.asSequence()
            .sumOf { (_, toppingPlacement) ->
                when (toppingPlacement) {
                    Left, Right -> R.string.price_placement_half.toDouble()
                    All -> R.string.price_placement_whole.toDouble()
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

    fun setSize(dropDownSizeSelect: Size): Pizza {
        return copy(
            size = dropDownSizeSelect
        )
    }
}
