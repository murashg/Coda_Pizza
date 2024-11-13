package android.bignerdranch.codapizza.ui

import android.bignerdranch.codapizza.R
import android.bignerdranch.codapizza.model.Pizza
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import java.text.NumberFormat

@Composable
fun OrderButton(
    pizza: Pizza,
    currencyFormatter: NumberFormat,
    modifier: Modifier = Modifier
){
    Button(
        modifier = modifier,
        onClick = {
            // TODO
        }
    ) {
        val price = currencyFormatter.format(pizza.price)
        Text(
            text = stringResource(
                R.string.place_order_button,
                stringResource(pizza.size.sizeName),
                price
            )
                .uppercase()
        )
    }
}