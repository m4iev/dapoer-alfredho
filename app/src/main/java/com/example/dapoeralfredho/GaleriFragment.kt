package com.example.dapoeralfredho

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.dapoeralfredho.databinding.FragmentGaleriBinding


class GaleriFragment : Fragment() {

    private lateinit var binding: FragmentGaleriBinding
    private lateinit var dataArrayList: ArrayList<DataMakanan>
    private lateinit var gridView: GridView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGaleriBinding.inflate(inflater, container, false)
        val view = inflater.inflate(R.layout.fragment_galeri, container, false)
        gridView = view.findViewById(R.id.cardview_gridview)

        val nama = arrayOf(
            "Nasi Goreng",
            "Martabak",
            "Teh Botol",
            "Teh Botol Kotak",
            "Teh Pucuk",
        )

        val gambar = intArrayOf(
            R.drawable.nasgor_clear,
            R.drawable.martabak_clear,
            R.drawable.tehbotol_clear,
            R.drawable.tehbotolkotak,
            R.drawable.tehpucuk,
        )

        val harga = arrayOf(
            "Rp. 30.000",
            "Rp. 28.000",
            "Rp. 15.000",
            "Rp. 12.000",
            "Rp. 15.000",
        )

        val deskripsi = arrayOf(
            "Rasakan sensasi pedas gurih Nasi Goreng kami, bikin nagih setiap suapan! Diolah dengan bumbu rahasia turun temurun, cita rasa autentik yang tak terlupakan.",
            "Rasakan ledakan rasa Martabak Kari yang belum pernah Anda coba sebelumnya! Perpaduan gurihnya martabak dengan aroma kari yang khas, bikin ketagihan! Kelezatan rempah pilihan dalam setiap gigitan, menciptakan sensasi rasa yang tak terlupakan. Nikmati Martabak Kari dengan isian daging sapi, ayam, atau sayuran segar, semuanya lezat!",
            "Rasakan kesegaran teh asli dalam setiap tegukan Teh Botol, teman setia di setiap aktivitasmu! Praktis dan menyegarkan, siap menemani harimu yang padat. Lepaskan dahaga dengan sensasi rasa teh yang autentik, tanpa ribet!",
            "Kesegaran teh asli dalam kemasan kotak yang praktis dan enak digenggam!",
            "Rasakan kesegaran teh asli dari pucuk daun teh pilihan, Teh Pucuk hadir untuk menyegarkan harimu! Dipetik dari kebun teh terbaik, nikmati cita rasa teh yang autentik dan berkualitas tinggi. Setiap tegukan Teh Pucuk memberikan sensasi kesegaran alami yang tak tertandingi.",
        )

        dataArrayList = ArrayList()

        for (i in nama.indices) {
            val data = DataMakanan(nama[i], gambar[i], harga[i])
            dataArrayList.add(data)
        }

        binding.cardviewGridview.isClickable = true
        gridView.adapter = MyAdapter(requireActivity(), dataArrayList)
        gridView.setOnItemClickListener { _, _, position, _ ->
            val gambar = gambar[position]
            val nama = nama[position]
            val deskripsi = deskripsi[position]

            val i = Intent(requireActivity(), MenuDetail::class.java)
            i.putExtra("gambarMakanan", gambar)
            i.putExtra("namaMakanan", nama)
            i.putExtra("deskripsiMakanan", deskripsi)
            startActivity(i)
        }

        return view
    }
}