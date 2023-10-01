package com.example.quotes

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quotes.models.quoteDataClassItem
import com.google.gson.Gson

object DataManager {

    var data= emptyArray<quoteDataClassItem>()
    var isDataLoaded= mutableStateOf(false)

    fun loadAssetsFromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer=ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json= String(buffer,Charsets.UTF_8)
        val gson= Gson()
        data=gson.fromJson(json,Array<quoteDataClassItem>::class.java)
        isDataLoaded.value= true
    }
}