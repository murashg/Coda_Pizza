package android.bignerdranch.codapizza.ui

import android.bignerdranch.codapizza.R
import android.bignerdranch.codapizza.model.Topping
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun ToppingPlacementDialog(
    topping: Topping,
    onDismissRequest: () -> Unit
) {
    Dialog(onDismissRequest = { onDismissRequest }) {
        Card {
            val toppingName = stringResource(topping.toppingName)
            Text(
                text = stringResource(R.string.placement_prompt, toppingName),
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(24.dp)
            )
        }
    }
}