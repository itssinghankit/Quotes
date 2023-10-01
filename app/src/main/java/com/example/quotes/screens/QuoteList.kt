package com.example.quotes.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotes.models.quoteDataClassItem

@Composable
fun QuoteList(data:Array<quoteDataClassItem>,onclick:()->Unit) {

    LazyColumn(content = {
        items(data){
            QuoteItem(quote = it) {
                onclick
            }
        }
    })
}