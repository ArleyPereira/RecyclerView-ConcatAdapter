package com.br.recyclerview_concatadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterUser(
    private val userList: List<User>
) : RecyclerView.Adapter<AdapterUser.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater
            .from(parent.context).inflate(R.layout.item_adapter, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {}

    override fun getItemCount() = userList.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}