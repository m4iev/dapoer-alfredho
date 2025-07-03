package com.example.dapoeralfredho

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


class KontakFragment : Fragment()   {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_kontak, container, false)

        val instagramButton = view.findViewById<ImageButton>(R.id.ig_button)
        val facebookButton = view.findViewById<ImageButton>(R.id.fb_button)
        val twitterButton = view.findViewById<ImageButton>(R.id.twitter_button)
        val whatsappButton = view.findViewById<ImageButton>(R.id.wa_button)

        instagramButton.setOnClickListener {
            val instagramIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/alfrdhorzky_"))
            startActivity(instagramIntent)
        }

        facebookButton.setOnClickListener {
            val facebookIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/alfrdhorzky"))
            startActivity(facebookIntent)
        }

        twitterButton.setOnClickListener {
            val twitterIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/alfrdhorzky"))
            startActivity(twitterIntent)
        }

        whatsappButton.setOnClickListener {
            val url = "https://api.whatsapp.com/send?phone=+6289626379082"
            val waIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(waIntent)
        }
        return view
    }
}