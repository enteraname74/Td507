package com.example.td507.storage

import android.content.Context
import com.example.td507.model.Expense
import com.example.td507.storage.utility.file.JSONFileStorage
import org.json.JSONObject

class ExpenseJSONStorage(context : Context) : JSONFileStorage<Expense>(context, "expense") {

    override fun create(id: Int, obj: Expense): Expense {
        return Expense(id, obj.name, obj.category, obj.amount, obj.date, obj.author)
    }

    override fun objectToJson(id: Int, obj: Expense): JSONObject {
        var res = JSONObject()

        res.put(Expense.ID, id)
        res.put(Expense.NAME, obj.name)
        res.put(Expense.CATEGORY, obj.category)
        res.put(Expense.AMOUNT, obj.amount)
        res.put(Expense.DATE, obj.date)
        res.put(Expense.AUTHOR, obj.author)

        return res
    }

    override fun jsonToObject(json: JSONObject): Expense {
        return Expense(
            json.getInt(Expense.ID),
            json.getString(Expense.NAME),
            json.getInt(Expense.CATEGORY),
            json.getString(Expense.AMOUNT),
            json.getString(Expense.DATE),
            json.getInt(Expense.AUTHOR)
            )
    }
}