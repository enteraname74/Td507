package com.example.td507.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.td507.R

class ExpenseAdapter: RecyclerView.Adapter<ExpenseAdapter.ExpenseHolder>(){

    class ExpenseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val category: ImageView = itemView.findViewById(R.id.expense_category)
        val name: TextView = itemView.findViewById(R.id.expense_name)
        val amount: TextView = itemView.findViewById(R.id.expense_amount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.expense_file, parent, false)
        return ExpenseHolder(view)
    }

    override fun onBindViewHolder(holder: ExpenseHolder, position: Int) {
        holder.category.setImageResource(R.drawable.ic_baseline_category_24)
        holder.name.text = "Ma dépense"
        holder.amount.text = "23.50"
    }

    override fun getItemCount(): Int {
        return 10
    }
}