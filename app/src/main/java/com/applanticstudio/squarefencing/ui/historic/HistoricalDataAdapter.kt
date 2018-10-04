package com.applanticstudio.squarefencing.ui.historic

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.applanticstudio.squarefencing.data.model.Event


class HistoricalDataAdapter(private val dataSource: List<Event>) : RecyclerView.Adapter<HistoricalDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = TextView(parent.context)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSource[position].toString()
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}