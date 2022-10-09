package com.example.td507.storage.utility.file

import android.content.Context
import org.json.JSONObject
import org.json.JSONTokener

abstract class JSONFileStorage<T>(context : Context, name : String) : FileStorage<T>(context, name, ".json"){

    protected abstract fun objectToJson(id: Int, obj: T) : JSONObject
    protected abstract fun jsonToObject(json : JSONObject) : T

    override fun create(id: Int, obj: T): T {
        TODO("Not yet implemented")
    }

    override fun dataToString(data: HashMap<Int, T>): String {
        val json = JSONObject()
        data.forEach{ pair -> json.put("($pair, key)", objectToJson(pair.key, pair.value)) }
        return json.toString()
    }

    override fun stringToData(value: String): HashMap<Int, T> {
        val data = HashMap<Int, T>()
        val json = JSONObject(value)
        val iterator = json.keys()

        TODO("Not yet implemented")
        return data
    }
}