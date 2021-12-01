package com.ziad.motasem.hellotest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ziad.motasem.hellotest2.adapter.ItemAdapter
import com.ziad.motasem.hellotest2.data.ListOfItems
import com.ziad.motasem.hellotest2.databinding.ActivityMainBinding
import com.ziad.motasem.hellotest2.model.Item

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = ListOfItems.items

        binding.rvItems.layoutManager = LinearLayoutManager(this)
        binding.rvItems.setHasFixedSize(true)
        binding.rvItems.adapter = ItemAdapter(this, data)
    }
}