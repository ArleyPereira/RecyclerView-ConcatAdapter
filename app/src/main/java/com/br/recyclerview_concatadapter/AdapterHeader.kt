package com.br.recyclerview_concatadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterHeader : RecyclerView.Adapter<AdapterHeader.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater
            .from(parent.context).inflate(R.layout.item_header, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {}

    override fun getItemCount() = 1

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}