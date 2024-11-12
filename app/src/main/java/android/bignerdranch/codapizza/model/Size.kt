package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.StringRes

enum class Size(
    @StringRes val sizeName: Int,
    val price: Double
) {
    Small(
        sizeName = R.string.size_s,
        price = R.string.price_size_small.toDouble()
    ),
    Medium(
        sizeName = R.string.size_m,
        price = R.string.price_size_medium.toDouble()
    ),
    Large(
        sizeName = R.string.size_l,
        price = R.string.price_size_large.toDouble()
    ),
    ExtraLarge(
        sizeName = R.string.size_xl,
        price = R.string.price_size_extra_large.toDouble()
    );
}