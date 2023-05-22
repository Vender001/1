package com.example.Lab2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.Lab2.databinding.ItemActivityBinding

class Adapter(
    val context: Context,
    val onClick: (model: Animal, position: Int) -> Unit,
) : RecyclerView.Adapter<Adapter.GamesHolder>() {
    private val list = ArrayList<Animal>()

    inner class GamesHolder(val binding: ItemActivityBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(animal: Animal, position: Int) {
            binding.tv1.text = animal.Name
            binding.tv2.text = animal.Breed
            Glide.with(context)
                .load(animal.ResId)
                .into(binding.imageView)
            binding.info.setOnClickListener {
                onClick(animal, position)
                val navController = binding.root.findNavController()
                val bundle = Bundle()
                bundle.putString("myTextView", animal.Description)
                bundle.putString("myTextView2", animal.Name)
                navController.navigate(R.id.firstToSecond, bundle)
            }


        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesHolder {
        val view = ItemActivityBinding.inflate(LayoutInflater.from(context), parent, false)
        return GamesHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GamesHolder, position: Int) {
        val animal = list[position]
        holder.bindView(animal, position)


    }

    fun setNewData(newList: List<Animal>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()

    }

}