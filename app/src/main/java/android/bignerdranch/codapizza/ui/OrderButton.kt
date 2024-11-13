package android.bignerdranch.codapizza.ui

import android.bignerdranch.codapizza.R
import android.bignerdranch.codapizza.model.Pizza
import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import java.text.NumberFormat

@Composable
fun OrderButton(
    pizza: Pizza,
    onEditPizza: (Pizza) -> Unit,
    currencyFormatter: NumberFormat,
    modifier: Modifier = Modifier
){
    val context = LocalContext.current
    Button(
        modifier = modifier,
        onClick = {
            Toast.makeText(context, R.string.order_placed_toast, Toast.LENGTH_LONG)
                .show()
            onEditPizza(pizza.clearPizza())
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