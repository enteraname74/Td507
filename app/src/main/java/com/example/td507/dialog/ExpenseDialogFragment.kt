package com.example.td507.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Spinner
import androidx.fragment.app.DialogFragment
import com.example.td507.R
import com.example.td507.adapter.CategoryAdapter

class ExpenseDialogFragment(private val id: Int?) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = requireActivity().layoutInflater.inflate(R.layout.dialog_expense, null)
        view.findViewById<Spinner>(R.id.expense_category).adapter = CategoryAdapter()
        return AlertDialog.Builder(requireContext())
        .setTitle(if (id == null) R.string.expense_dialog_name else R.string.expense_dialog_edit)
        .setView(view)
        .setPositiveButton(R.string.expense_dialog_confirm, null)
        .setNegativeButton(R.string.expense_dialog_cancel, null)
        .create()
    }
}