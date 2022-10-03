package com.example.td507.storage

import android.content.Context
import android.content.SharedPreferences
import com.example.td507.storage.utility.Storage

class ExpenseStorage {

    private fun getPreferences(context : Context): SharedPreferences {
        return context.getSharedPreferences("com.example.td507.preferences", Context.MODE_PRIVATE)
    }

    fun getStorage(context : Context) : Int{
        return 0
    }

    fun setStorage(context: Context, prefStorage: Int){

    }

    fun get(context : Context): Storage<Expense>{
        return null
    }
}