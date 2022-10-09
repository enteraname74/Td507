package com.example.td507.model

class Expense(
    val id : Int,
    val name : String,
    val category : Int,
    val amount : String,
    val date : String,
    val author : Int
) {

    companion object {
        const val ID = "id"
        const val NAME = "name"
        const val CATEGORY = "category"
        const val AMOUNT = "amount"
        const val AUTHOR = "author"
        const val DATE = "date"
    }
}