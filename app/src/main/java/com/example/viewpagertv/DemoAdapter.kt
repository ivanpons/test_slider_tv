package com.example.viewpagertv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DemoAdapter(val textos: List<String>): RecyclerView.Adapter<DemoAdapter.ViewHolder> (){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val item = textos[position]
        holder.bind(item)
    }

    override fun getItemCount() = textos.size


class ViewHolder(val binding: View) :RecyclerView.ViewHolder(binding){
    fun bind(texto: String) {
        val textView = binding.findViewById<TextView>(R.id.textV)
    textView.text=texto
    }
}

}