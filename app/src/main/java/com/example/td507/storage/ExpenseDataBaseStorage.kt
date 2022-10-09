package com.example.td507.storage

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import com.example.td507.helper.DataBaseHelper
import com.example.td507.model.Expense
import com.example.td507.storage.utility.DataBaseStorage

class ExpenseDataBaseStorage(context : Context) : DataBaseStorage<Expense>(DataBaseHelper(context), "epxense") {

    companion object {
        const val ID = 0
        const val NAME = 1
        const val CATEGORY = 2
        const val AMOUNT = 3
        const val DATE = 4
        const val AUTHOR = 5
    }

    override fun objectToValues(obj: Expense): ContentValues {
        TODO("Not yet implemented")
    }

    override fun cursorToObject(cursor: Cursor): Expense {
        return Expense(
            cursor.getInt(ExpenseDataBaseStorage.ID),
            cursor.getString(ExpenseDataBaseStorage.NAME),
            cursor.getInt(ExpenseDataBaseStorage.ID),
            cursor.getString(ExpenseDataBaseStorage.AMOUNT),
            cursor.getString(ExpenseDataBaseStorage.DATE),
            cursor.getInt(ExpenseDataBaseStorage.AUTHOR)
        )
    }
}