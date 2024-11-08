package android.bignerdranch.codapizza.ui

import android.bignerdranch.codapizza.R
import android.bignerdranch.codapizza.model.Pizza
import android.bignerdranch.codapizza.model.Topping
import android.bignerdranch.codapizza.model.ToppingPlacement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.text.NumberFormat

@Preview
@Composable
fun PizzaBuilderScreen(
    modifier: Modifier = Modifier
){
    var pizza by remember { mutableStateOf(Pizza()) }
    Column(
        modifier = modifier
    ){
        ToppingsList(
            pizza = pizza,
            onEditPizza = { pizza = it },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = true)
        )
        OrderButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Composable
private fun ToppingsList(
    pizza: Pizza,
    onEditPizza: (Pizza) -> Unit,
    modifier: Modifier = Modifier
){
    LazyColumn(
        modifier = modifier
    ) {
        items(Topping.entries.toTypedArray()) { topping ->
            ToppingCell(
                topping = topping,
                placement = pizza.toppings[topping],
                onClickTopping = {
                    val isOnPizza = pizza.toppings[topping] != null
                    onEditPizza(pizza.withTopping(
                        topping = topping,
                        placement = if (isOnPizza) {
                            null
                        } else {
                            ToppingPlacement.All
                        }
                    ))
                }
            )
        }
    }
}

@Composable
private fun OrderButton(
    pizza: Pizza,
    modifier: Modifier = Modifier
){
    Button(
        modifier = modifier,
        onClick = {
            // TODO
        }
    ) {
        val currencyFormatter = NumberFormat.getCurrencyInstance()
        val price = currencyFormatter.format(pizza.price)
        Text(
            text = stringResource(R.string.place_order_button, price)
                .uppercase()
        )
    }
}