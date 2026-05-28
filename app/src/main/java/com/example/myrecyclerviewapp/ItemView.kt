package com.example.myrecyclerviewapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var image = itemView.findViewById<ImageView>(R.id.image)
    var name = itemView.findViewById<TextView>(R.id.name)
    var title = itemView.findViewById<TextView>(R.id.title)

}