package com.example.basisassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.basisassignment.R
import com.example.basisassignment.data.model.Data
import kotlinx.android.synthetic.main.card_layout.view.*

class CardAdapter(val items: List<Data>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.titleText.text = item.text
    }


}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var titleText = view.title_text
}