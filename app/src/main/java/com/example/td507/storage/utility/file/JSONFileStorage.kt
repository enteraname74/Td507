package com.example.td507.storage.utility.file

import android.content.Context
import org.json.JSONObject

abstract class JSONFileStorage<T>(context : Context, name : String) : FileStorage<T>(context, name, ".json"){

    protected abstract fun objectToJson(id: Int, obj: T) : JSONObject
    protected abstract fun jsonToObject(json : JSONObject) : T

    override fun create(id: Int, obj: T): T {
        TODO("Not yet implemented")
    }

    override fun dataToString(data: HashMap<Int, T>): String {
        val json = JSONObject()
        TODO("Not yet implemented")
        return json.toString()
    }

    override fun stringToData(value: String): HashMap<Int, T> {
        val data = HashMap<Int, T>()
        TODO("Not yet implemented")
        return data
    }
}