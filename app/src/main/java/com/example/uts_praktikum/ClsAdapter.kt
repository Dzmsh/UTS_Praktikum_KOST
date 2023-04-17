package com.example.uts_praktikum

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClsAdapter (private val Datadata: ArrayList<Datakamar>, private val context: Context
): RecyclerView.Adapter<ClsAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClsAdapter.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_data,
            parent, false
        )
        return CourseViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ClsAdapter.CourseViewHolder, position: Int) {
        holder.kamar.text = Datadata.get(position).Kamar
        holder.penghuni.text = Datadata.get(position).Penghuni
        holder.hbul.text =Datadata.get(position).hbul
        holder.hsem.text =Datadata.get(position).hsem
        holder.keterangan.text = Datadata.get(position).Keterangan
        holder.foto.setImageResource(Datadata.get(position).foto)
    }
    override fun getItemCount(): Int {
        return Datadata.size
    }
    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.idfoto)
        val kamar: TextView = itemView.findViewById(R.id.idKamar)
        val hbul: TextView = itemView.findViewById(R.id.idhbul)
        val hsem: TextView = itemView.findViewById(R.id.idhsem)
        val penghuni: TextView = itemView.findViewById(R.id.idPenghuni)
        val keterangan: TextView = itemView.findViewById(R.id.idKeterangan)
    }
}