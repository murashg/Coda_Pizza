package android.bignerdranch.codapizza.ui

import android.bignerdranch.codapizza.R
import android.bignerdranch.codapizza.model.Pizza
import android.bignerdranch.codapizza.model.Size
import android.bignerdranch.codapizza.model.Topping
import android.bignerdranch.codapizza.model.ToppingPlacement
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PizzaSizeDropdown(
    pizza: Pizza,
    onEditPizza: (Pizza) -> Unit,
    modifier: Modifier = Modifier
) {
    var isDropDownExpanded by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                isDropDownExpanded = true
            }
        ) {
            Text(
                text = "Pizza Size",
                style = MaterialTheme.typography.titleMedium
            )
            Image(
                painter = painterResource(R.drawable.drop_down_ic),
                contentDescription = "DropDownIcon"
            )
        }
        DropdownMenu(
            expanded = isDropDownExpanded,
            onDismissRequest = {
                isDropDownExpanded = false
            },
            modifier = modifier
        ) {
            Size.entries.toTypedArray().forEach { size ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = stringResource(size.sizeName),
                            modifier = Modifier
                                .padding(8.dp)
                        )
                    },
                    enabled = pizza.size != size,
                    onClick = {
                        onEditPizza(pizza.setSize(size))
                        isDropDownExpanded = false
                    },
                    modifier = Modifier
                )
            }
        }
    }
}

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
        onEditPizza = {},
        modifier = Modifier
    )
}