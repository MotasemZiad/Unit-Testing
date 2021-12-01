package com.ziad.motasem.hellotest2.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ziad.motasem.hellotest2.databinding.ItemBinding
import com.ziad.motasem.hellotest2.model.Item

class ItemAdapter(val activity: Activity, val data: ArrayList<Item>): RecyclerView.Adapter<ItemAdapter.ViewHolder>()  {

    class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val tvName = binding.tvName
        val tvEmail = binding.tvEmail
        val card = binding.cardItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(activity), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = data[position].name
        holder.tvEmail.text = data[position].email

        holder.card.setOnClickListener {
            Toast.makeText(activity, "Card #${data[position]}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}