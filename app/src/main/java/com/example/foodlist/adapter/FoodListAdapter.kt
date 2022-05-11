package com.example.foodlist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlist.R
import com.example.foodlist.model.FoodListDeclaration

class FoodListAdapter (private val context: Context, private val foodList: List<FoodListDeclaration>) :
    RecyclerView.Adapter<FoodListAdapter.FoodListViewHolder>() {

    class FoodListViewHolder(private val view : View) : RecyclerView.ViewHolder(view) {
        val foodName : TextView = view.findViewById(R.id.tvFood)
        val foodPrice : TextView = view.findViewById(R.id.tvPrice)
        val foodImage : ImageView = view.findViewById(R.id.ivFoodImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodListViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return FoodListViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: FoodListViewHolder, position: Int) {
        val item = foodList[position]
        holder.foodName.text = context.resources.getString(item.food)
        holder.foodPrice.text = context.resources.getString(item.price)
        holder.foodImage.setImageResource(item.image)
    }

    override fun getItemCount() = foodList.size

}