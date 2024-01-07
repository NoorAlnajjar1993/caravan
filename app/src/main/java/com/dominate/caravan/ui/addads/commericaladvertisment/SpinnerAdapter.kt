package com.dominate.caravan.ui.addads.commericaladvertisment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class SpinnerAdapter(context: Context, resource: Int, items: List<String>?, textColor: Int) :
    ArrayAdapter<String>(context, resource, items?: listOf()) {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private val textColor: Int = textColor

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent) as TextView
        view.setTextColor(textColor)
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getDropDownView(position, convertView, parent) as TextView
        view.setTextColor(textColor)
        return view
    }
}
