package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.StringRes

enum class ToppingPlacement(
    @StringRes val label: Int,
    val price: Double
) {
    Left(
        label = R.string.placement_left,
        price = 0.5
    ),
    Right(
        label = R.string.placement_right,
        price = 0.5
    ),
    All(
        label = R.string.placement_all,
        price = 1.0
    )
}