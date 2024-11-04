package android.bignerdranch.codapizza.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun ToppingCellPreview() {
    ToppingCell()
}

@Composable
fun ToppingCell() {
    Row {
        Checkbox(
            checked = true,
            onCheckedChange = { }
        )
        Column {
            Text(
                text = "Pineapple"
            )
            Text(
                text = "Whole pizza"
            )
        }
    }
}