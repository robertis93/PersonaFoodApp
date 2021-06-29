package com.example.personafoodapp

import AdapterRecyclerView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.personafoodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(binding.getRoot())


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val listViewType = mutableListOf(
            AdapterRecyclerView.ITEM_ACCESS_FREE,
            AdapterRecyclerView.ITEM_MYCARD,
            AdapterRecyclerView.ITEM_SALES,
            AdapterRecyclerView.ITEM_STATISTIC,
            AdapterRecyclerView.MY_TRENING
        )
        val adapterRecyclerView = AdapterRecyclerView(listViewType = listViewType)
        binding.recyclerView.adapter = adapterRecyclerView
    }
}



