package com.example.proyectomultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectomultimedia.databinding.ActivityInfoBurgerBinding

class InfoBurger : AppCompatActivity() {
    private lateinit var binding: ActivityInfoBurgerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInfoBurgerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}