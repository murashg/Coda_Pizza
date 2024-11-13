package android.bignerdranch.codapizza.model

import android.bignerdranch.codapizza.R
import androidx.annotation.StringRes

enum class Size(
    @StringRes val sizeName: Int,
    @StringRes val sizeNameWithPrice: Int,
    val price: Double
) {
    Small(
        sizeName = R.string.size_s,
        sizeNameWithPrice = R.string.size_s_with_price,
        price = 7.99
    ),
    Medium(
        sizeName = R.string.size_m,
        sizeNameWithPrice = R.string.size_m_with_price,
        price = 9.99
    ),
    Large(
        sizeName = R.string.size_l,
        sizeNameWithPrice = R.string.size_l_with_price,
        price = 14.99
    ),
    ExtraLarge(
        sizeName = R.string.size_xl,
        sizeNameWithPrice = R.string.size_xl_with_price,
        price = 19.99
    );
}