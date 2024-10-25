package com.example.thirtydaysapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DaysAdapter(private val itemList: List<ItemsViewModel>) :
    RecyclerView.Adapter<DaysAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.textView)
        val image: ImageView = itemView.findViewById(R.id.imageView)
        val des: TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.days_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemList[position]
        holder.title.text = item.title
        holder.des.text = item.des
        holder.image.setImageResource(item.imageResId)
    }

    override fun getItemCount() = itemList.size
}
