package com.example.dapoeralfredho

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dapoeralfredho.databinding.ActivityMenuDetailBinding

class MenuDetail : AppCompatActivity() {
    private lateinit var binding: ActivityMenuDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gambarMakanan = intent.getIntExtra("gambarMakanan", R.drawable.ic_launcher_foreground)
        val namaMakanan = intent.getStringExtra("namaMakanan")
        val deskripsiMakanan = intent.getStringExtra("deskripsiMakanan")

        binding.makananIcon.setImageResource(gambarMakanan)
        binding.titleMakanan.text = namaMakanan
        binding.deskripsiMakanan.text = deskripsiMakanan
    }
}