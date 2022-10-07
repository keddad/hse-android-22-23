package com.keddad.hw5

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IpInfoAdapter(val data: List<IpInfo>) : RecyclerView.Adapter<IpInfoAdapter.ViewHolder>() {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val ipText = itemView.findViewById<TextView>(R.id.name)
        val ipImage = itemView.findViewById<ImageView>(R.id.status)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.list_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ip = data[position]

        holder.ipText.setText(ip.Ip)

        if (ip.Online) {
            holder.ipImage.setImageResource(R.drawable.green)
        } else {
            holder.ipImage.setImageResource(R.drawable.red)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}