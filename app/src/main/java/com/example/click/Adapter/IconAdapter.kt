package com.example.click.Adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.click.Modul.Icon
import com.example.click.R

class IconAdapter(var context: Context, var icons: ArrayList<Icon>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return icons.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_icons_horizontal,parent,false)
        return IconViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val icon = icons[position]

        if (holder is IconViewHolder){
            var iv_icon = holder.iv_icon
            var tv_icon = holder.tv_text

            iv_icon.setImageResource(icon.icon)
            tv_icon.text = icon.text
        }
    }

    class IconViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var iv_icon : ImageView
        var tv_text : TextView

        init {
            iv_icon = view.findViewById(R.id.iv_icon)
            tv_text = view.findViewById(R.id.tv_icon)
        }
    }
}