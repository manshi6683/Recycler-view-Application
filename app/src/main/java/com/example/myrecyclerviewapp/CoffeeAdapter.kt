package com.example.myrecyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapp.models.Coffee

class CoffeeAdapter(var data: MutableList<Coffee>)
    : RecyclerView.Adapter<ItemView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemView {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return ItemView(view)
    }

    override fun onBindViewHolder(holder: ItemView, position: Int) {

        holder.image.setImageResource(data[position].image)
        holder.name.text = data[position].name
        holder.title.text = data[position].title
    }

    override fun getItemCount(): Int {
        return data.size
    }
}