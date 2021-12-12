package com.noval.duniaremaja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.grid_item.view.*

class Adapter(var list: ArrayList<DataModel>) : RecyclerView.Adapter<Adapter.Viewholder>() {
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image_poster = itemView.image_poster
        var text_judul = itemView.text_judul
        var text_pengarang = itemView.text_pengarang
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.grid_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.text_judul.text=list[position].judul
        holder.text_pengarang.text=list[position].pengarang
        holder.image_poster.setImageResource(list[position].image_id)
    }

    override fun getItemCount(): Int {
      return list.size
    }
}