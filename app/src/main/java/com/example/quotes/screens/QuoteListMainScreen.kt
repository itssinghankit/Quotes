package com.example.quotes.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotes.R
import com.example.quotes.models.quoteDataClassItem

@Composable
fun QuoteListMainScreen(data:Array<quoteDataClassItem>,onclick:(quote:quoteDataClassItem)->Unit) {
    Column() {
        Text(
            text = "Our Quotes",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontFamily = FontFamily(
                Font(R.font.montserrat_semibold)
            ),
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f)
        )
        QuoteList(data = data,onclick )
    }
}