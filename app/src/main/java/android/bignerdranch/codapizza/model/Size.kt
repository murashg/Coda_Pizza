package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.StringRes

enum class Size(
    @StringRes val sizeName: Int,
    val price: Double
) {
    Small(
        sizeName = R.string.size_s,
        price = 7.99
    ),
    Medium(
        sizeName = R.string.size_m,
        price = 9.99
    ),
    Large(
        sizeName = R.string.size_l,
        price = 14.99
    ),
    ExtraLarge(
        sizeName = R.string.size_xl,
        price = 19.99
    );
}