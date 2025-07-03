package com.example.dapoeralfredho

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class MyAdapter(
    private val context: Activity,
    private val arrayList: ArrayList<DataMakanan>
):
    ArrayAdapter<DataMakanan>(context, R.layout.card_view_item_layout, arrayList)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.card_view_item_layout, null)

        val imageView: ImageView = view.findViewById(R.id.gambarMakanan)
        val nama: TextView = view.findViewById(R.id.textMakanan)
        val harga: TextView = view.findViewById(R.id.textHarga)

        imageView.setImageResource(arrayList[position].gambar)
        nama.text = arrayList[position].nama
        harga.text = arrayList[position].harga

        return view
    }
}