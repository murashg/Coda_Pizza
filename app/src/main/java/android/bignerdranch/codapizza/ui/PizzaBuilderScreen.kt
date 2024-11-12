package android.bignerdranch.codapizza.ui

import android.bignerdranch.codapizza.model.Pizza
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun PizzaBuilderScreen(
    modifier: Modifier = Modifier
){
    var pizza by rememberSaveable { mutableStateOf(Pizza()) }
    Column(
        modifier = modifier
    ){
        Header()
        PizzaSizeDropdown(
            pizza = pizza,
            onEditPizza = { pizza = it },
            modifier = Modifier
        )
        ToppingsList(
            pizza = pizza,
            onEditPizza = { pizza = it },
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = true)
        )
        OrderButton(
            pizza = pizza,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Composable
private fun Header(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
            .padding(16.dp)
    ){
        Text(
            text = "Coda Pizza by Greg Murashige"
        )
    }
}