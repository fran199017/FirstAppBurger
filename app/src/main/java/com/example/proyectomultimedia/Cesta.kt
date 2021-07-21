package com.example.proyectomultimedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectomultimedia.databinding.ActivityCestaBinding


class Cesta : AppCompatActivity() {
    private lateinit var binding: ActivityCestaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCestaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Cargar datos de la cesta
        var bundle = intent.extras
        binding.labelCestaTotal.text = "El total de la cesta es: " + bundle?.getString("sumaPedido") + "€"
        binding.listadoCesta.text = bundle?.getString("listado") + bundle?.getString("listado2") + bundle?.getString("listado3") + bundle?.getString("listado4")+ bundle?.getString("listado5")
    }//Override
}//Class