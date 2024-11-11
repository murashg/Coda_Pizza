package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.StringRes

enum class Size(
    @StringRes val sizeName: Int
) {
    Small(
        sizeName = R.string.size_s
    ),
    Medium(
        sizeName = R.string.size_m
    ),
    Large(
        sizeName = R.string.size_l
    ),
    ExtraLarge(
        sizeName = R.string.size_xl
    )
}