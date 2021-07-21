package com.example.proyectomultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.proyectomultimedia.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Comprobacion, de que si pulsamos el Switch, nos vuelva a ocultar el label de Terminos
        binding.switch1.setOnClickListener{
            if(binding.switch1.isChecked)
                binding.labelAceptarCondiciones.isVisible= false
        }

        binding.bAcceder.setOnClickListener{
          //  var Nombre:String= binding.txtUsuario.text.toString()
           //Comprobacion de los Terminos y condiciones.
            if(binding.switch1.isChecked) {
                // Iniciamos actividad de esta a Pedido y con putExtra cogemos el txtUsuario y le añadimos la etiqueta Nombre, para identificarlo en el otro Layout.
                startActivity(Intent(this, Pedido::class.java).putExtra("Nombre", binding.txtUsuario.text.toString()))
            }
            else
                binding.labelAceptarCondiciones.isVisible= true

        }//Boton Acceder

        binding.bCondiciones.setOnClickListener{
            startActivity((Intent(this,Terminos::class.java)))
        }

    }//onCreate
}