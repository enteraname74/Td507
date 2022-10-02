package com.example.td507.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.td507.R
import com.example.td507.adapter.ExpenseAdapter
import com.example.td507.dialog.ExpenseDialogFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener {
            sentToExpenseActivity()
        }

         */
        findViewById<RecyclerView>(R.id.expense_list).adapter = ExpenseAdapter()

        findViewById<FloatingActionButton>(R.id.expense_add).setOnClickListener {
            ExpenseDialogFragment(null).show(supportFragmentManager, null)
        }
    }

    /*
    private fun sentToExpenseActivity() {
        val intent = Intent(this, ExpenseActivity::class.java)
        startActivity(intent)
    }
     */
}