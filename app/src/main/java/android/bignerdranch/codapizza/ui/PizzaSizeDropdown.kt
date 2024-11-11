package android.bignerdranch.codapizza.ui

import android.bignerdranch.codapizza.model.Pizza
import android.bignerdranch.codapizza.model.Size
import android.bignerdranch.codapizza.model.Topping
import android.bignerdranch.codapizza.model.ToppingPlacement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun PizzaSizeDropdownMedium() {
    PizzaSizeDropdown(
        Pizza(
            toppings = mapOf(Topping.Pepperoni to ToppingPlacement.Right,
                Topping.Pineapple to ToppingPlacement.Right,
                Topping.Basil to ToppingPlacement.Left,
                Topping.Peppers to ToppingPlacement.All),
            size = Size.Medium
        ),
true,
        modifier = Modifier
    )
}

@Composable
fun PizzaSizeDropdown(
    pizza: Pizza,
    expanded: Boolean = false,
    modifier: Modifier = Modifier
) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {},
        modifier = modifier
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(Size.entries.toTypedArray()) {size ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = stringResource(size.sizeName),
                            modifier = Modifier
                                .padding(8.dp)
                        )
                    },
                    enabled = pizza.size == size,
                    onClick = {
                        pizza.setSize(size)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}