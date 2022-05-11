package com.example.foodlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlist.adapter.FoodListAdapter
import com.example.foodlist.data.FoodListDataSource
import com.example.foodlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFoodList = FoodListDataSource().loadDeclaration()
        val recyclerView = findViewById<RecyclerView>(R.id.rvFoodList)
        recyclerView.adapter = FoodListAdapter(this, myFoodList)

    }
}