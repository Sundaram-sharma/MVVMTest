package com.example.mvvmtest.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.concurrent.LinkedBlockingQueue

class FakeQuoteDao { //database table Data Access Object – DAO for Quotes
    private val quoteList = mutableListOf<Quote>() //from quote class
    private val quotes = MutableLiveData<List<Quote>>() //list of quote


    //init block will execute immediately after the primary constructor
    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote){
        quoteList.add(quote) // add the quote
        quotes.value = quoteList // add the value to the quote

    }

    //return all the quotes LIVEDATA
    fun getQuotes() = quotes as LiveData<List<Quote>>

}
