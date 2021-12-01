package com.ziad.motasem.hellotest2.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ziad.motasem.hellotest2.databinding.ItemBinding
import com.ziad.motasem.hellotest2.model.Item

class ItemAdapter(val data: ArrayList<Item>): RecyclerView.Adapter<ItemAdapter.ViewHolder>()  {

    class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val tvName = binding.tvName
        val tvEmail = binding.tvEmail
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = data[position].name
        holder.tvEmail.text = data[position].email
    }

    override fun getItemCount(): Int {
        return data.size
    }
}