package com.example.pertemuan_11_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PahlawanAdapter(private val heroList: ArrayList<PahlawanData>)
    : RecyclerView.Adapter<PahlawanAdapter.HeroViewHolder>() {

    var onItemClick: ((PahlawanData) -> Unit)? = null

    class HeroViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val gambarView: ImageView = itemView.findViewById(R.id.gambar_pahlawan)
        val teksView: TextView = itemView.findViewById(R.id.nama_pahlawan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val pahlawan = heroList[position]
        holder.gambarView.setImageResource(pahlawan.gambar)
        holder.teksView.text = pahlawan.nama

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(pahlawan)
        }
    }
}