package com.example.td507.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.td507.R

class CategoryAdapter: BaseAdapter() {
    companion object {
        private val IDS = arrayOf(1,2)
        private val ICONS = arrayOf(R.drawable.ic_baseline_shopping_cart_24, R.drawable.ic_baseline_category_24)
        private val TITLES = arrayOf(R.string.category_shopping, R.string.category_other)
    }
    override fun getCount(): Int { return IDS.size }
    override fun getItem(position: Int): Any {
        return IDS[position]
    }
    override fun getItemId(position: Int): Long {
        return IDS[position].toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        if (convertView == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        } else {
            view = convertView
        }

        view.findViewById<ImageView>(R.id.category_icon).setImageResource(ICONS[position])
        view.findViewById<TextView>(R.id.category_name).setText(TITLES[position])



        return view
    }
}