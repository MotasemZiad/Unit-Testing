package com.ziad.motasem.hellotest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ziad.motasem.hellotest2.adapter.ItemAdapter
import com.ziad.motasem.hellotest2.databinding.ActivityMainBinding
import com.ziad.motasem.hellotest2.model.Item

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = ArrayList<Item>()

        data.add(Item("Mohammed Ahmed", "mohammed@gmail.com"))
        data.add(Item("Ahmed Hassan", "ahmed@gmail.com"))
        data.add(Item("Fawzy Sameer", "fawzy@gmail.com"))
        data.add(Item("Moatasem Abu Nema", "moatasem.abunema@gmail.com"))
        data.add(Item("Mahmoud Haboub", "mahmoud@gmail.com"))
        data.add(Item("Malik Jouda", "malik@gmail.com"))
        data.add(Item("Abood Daher", "abood@gmail.com"))
        data.add(Item("Kamel Sami", "kamel@gmail.com"))
        data.add(Item("Ahmed Sami", "asami@gmail.com"))
        data.add(Item("Khaled Emad", "khaled@gmail.com"))
        data.add(Item("Ahmed Adas", "ahmed.adas@gmail.com"))
        data.add(Item("Mahmoud Haboub", "mahmoud@gmail.com"))
        data.add(Item("Malik Jouda", "malik@gmail.com"))
        data.add(Item("Abood Daher", "abood@gmail.com"))
        data.add(Item("Kamel Sami", "kamel@gmail.com"))

        binding.rvItems.layoutManager = LinearLayoutManager(this)
        binding.rvItems.setHasFixedSize(true)
        binding.rvItems.adapter = ItemAdapter(data)
    }
}