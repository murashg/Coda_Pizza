package android.bignerdranch.codapizza.model

data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
) {
    fun withTopping(topping: Topping, placement: ToppingPlacement?): Pizza {
        return copy(
            toppings = if (placement == null) {
                toppings - topping
            } else {
                toppings + (topping to placement)
            }
        )
    }
}
