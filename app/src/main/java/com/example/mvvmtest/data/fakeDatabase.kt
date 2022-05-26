package com.example.mvvmtest.data

class fakeDatabase private constructor() //private to not make visible to other
{
    companion object{ //immediately visible to the other threads
        @Volatile private var instance: fakeDatabase? = null
    }
}