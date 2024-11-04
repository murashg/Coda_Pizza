package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.StringRes

enum class ToppingPlacement(
    @StringRes val label: Int
) {
    Left(R.string.placement_left),
    Right(R.string.placement_right),
    All(R.string.placement_all)
}