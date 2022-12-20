package com.example.hw3mouth6.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hw3mouth6.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val data= arrayListOf<String>()
    private val list= arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addUrl()
        binding.recycler.layoutManager=GridLayoutManager(this,3)
        val adapter = ImageAdapter(this,data,){position->
            intent = Intent(this, SelectedImageActivity::class.java)
            intent.putStringArrayListExtra("KEY",list)
            list.add(data[position].toString())
        }
        binding.fab.setOnClickListener {
            startActivity(intent)
        }
        binding.recycler.adapter = adapter
    }

    private fun addUrl() {
        data.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRDMF4FPUKkV0DAHhlU0hrX5Z228SBxMEWOtNXyrDQ&s")
        data.add("https://media.tproger.ru/uploads/2016/04/1.jpg")
        data.add("https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873097_leto_gory_priroda_ozero_reka-1568x882.jpg ")
        data.add("https://life.fakty.com.ua/wp-content/uploads/sites/3/2022/03/27/novyj-proekt-10-620x349.png")
        data.add("https://cdn.fishki.net/upload/post/201508/05/1618749/main_1200-3.jpg")
        data.add("https://i.pinimg.com/originals/5f/0c/a2/5f0ca29df5528c07b4a2fb30b13abab4.jpg")
        data.add("https://www.shutterstock.com/image-illustration/stars-trail-polar-star-area-260nw-2073252950.jpg")
        data.add("https://i.pinimg.com/originals/5f/0c/a2/5f0ca29df5528c07b4a2fb30b13abab4.jpg")
        data.add("http://fotorelax.ru/wp-content/uploads/2016/02/Beautiful-photos-and-pictures-on-different-topics-01.jpg")
        data.add("https://fullhdoboi.ru/wp-content/uploads/_ph/6/735811463.jpg")
        data.add("https://mirpozitiva.ru/wp-content/uploads/2019/11/1478873091_bogii_korovki-na_cvetke-768x576.jpg ")
        data.add("https://www.ecobeneficial.com/wp-content/uploads/2014/04/Bee-on-Baptisia_chipmunk_1-768x576.jpg ")

    }
}