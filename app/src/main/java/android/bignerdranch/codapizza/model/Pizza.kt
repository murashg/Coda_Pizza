package android.bignerdranch.codapizza.model

data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
)
