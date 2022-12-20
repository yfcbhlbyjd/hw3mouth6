package com.example.hw3mouth6.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hw3mouth6.databinding.ActivitySelectedImageBinding
import com.example.hw3mouth6.ui.model.Image


class SelectedImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelectedImageBinding
    private val list= arrayListOf<Image>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySelectedImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recSelected.layoutManager=GridLayoutManager(this,3)
        val list=intent.getStringArrayListExtra("KEY")

        val adapter = ImageAdapter(this, list){}

        binding.recSelected.adapter=adapter


    }
}