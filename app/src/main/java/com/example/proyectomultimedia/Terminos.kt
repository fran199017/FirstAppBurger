package com.example.proyectomultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectomultimedia.databinding.ActivityTerminosBinding

class Terminos : AppCompatActivity() {
    private lateinit var binding: ActivityTerminosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTerminosBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bExit.setOnClickListener{
            startActivity((Intent(this,MainActivity::class.java)))
        }
    }
}