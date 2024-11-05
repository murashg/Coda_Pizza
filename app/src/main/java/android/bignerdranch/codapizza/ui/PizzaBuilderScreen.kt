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

@Preview
@Composable
fun PizzaBuilderScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ){
        ToppingsList(
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

private var pizza =
    Pizza(
        toppings = mapOf(
            Topping.Pepperoni to ToppingPlacement.All,
            Topping.Pineapple to ToppingPlacement.All
        )
    )

@Composable
private fun ToppingsList(
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
                    //TODO
                }
            )

        }
    }
}

@Composable
private fun OrderButton(
    modifier: Modifier = Modifier
){
    Button(
        modifier = modifier,
        onClick = {
            // TODO
        }
    ) {
        Text(
            text = stringResource(R.string.place_order_button)
                .uppercase()
        )
    }
}