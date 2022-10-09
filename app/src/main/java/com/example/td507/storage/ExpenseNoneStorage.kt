package com.example.td507.storage

import com.example.td507.model.Expense
import com.example.td507.storage.utility.Storage

class ExpenseNoneStorage : Storage<Expense> {
    override fun insert(obj: Expense): Int {
        return 0
    }

    override fun size(): Int {
        return 0
    }

    override fun find(id: Int): Expense? {
        return null
    }

    override fun findAll(): List<Expense> {
        return emptyList()
    }

    override fun update(id: Int, obj: Expense) {
    }

    override fun delete(id: Int) {
    }
}