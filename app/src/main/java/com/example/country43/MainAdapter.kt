package com.example.country43

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.country43.databinding.ItemBinding

class MainAdapter (private val data: ArrayList<Model> , private val onClick: (Int) -> Unit):
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    inner class ViewHolder(private var binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Model) {
            binding.itemIv.setImageResource(model.image)
            binding.itemTv.text = model.name

            itemView.setOnClickListener {
                onClick(model.keyId)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}