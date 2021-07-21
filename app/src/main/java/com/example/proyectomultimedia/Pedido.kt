package com.example.proyectomultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectomultimedia.databinding.ActivityPedidoBinding

class Pedido : AppCompatActivity() {
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Cogemos los datos del layout anterior
        val objetoIntent: Intent= intent
        var Nombre= objetoIntent.getStringExtra("Nombre")
        var sumaPedido:Int=0
        var str:String=""
        var str2:String=""
        var str3:String=""
        var str4:String=""
        var str5:String=""
        var contador:Int=0
        var contador2:Int=0
        var contador3:Int=0
        var contador4:Int=0
        var contador5:Int=0

        binding.labelBienvenido.text= "Bienvenido/a $Nombre"
        ////**********************INFORMACION HAMBURGUESA(Ejemplo 1 solo)****************************
        binding.bHamburguesa1.setOnClickListener{
            startActivity(Intent(this,InfoBurger::class.java))
        }
        ////**********************AÑADIR PEDIDO****************************
            binding.mas1.setOnClickListener {
                //AÑADIR PEDIDO
                contador++
                Toast.makeText(this, "Hamburguesa con queso x$contador",Toast.LENGTH_SHORT).show()
                binding.cont1.text=contador.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
                str = "-> Hamburguesa con queso    x" + contador + " = " + 7 * contador + "€ \n\n"
                if (str.contains("Hamburguesa con queso") == true) {
                    str = ""
                    str += "-> Hamburguesa con queso    x" + contador + " = " + 7 * contador + "€\n\n"
                }
                sumaPedido += 7
                binding.labelCesta.text = sumaPedido.toString() + "€"

            }
        binding.mas2.setOnClickListener{
            contador2++
            Toast.makeText(this, "Hamburguesa doble x$contador2",Toast.LENGTH_SHORT).show()
            binding.cont2.text=contador2.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
            str2="-> Hamburguesa doble   x" +contador2 +" = "+9*contador2+  "€ \n\n"
            if (str2.contains("Hamburguesa doble ")==true){
                str2=""
                str2+="-> Hamburguesa doble    x" + contador2  +" = "+9*contador2+  "€ \n\n"
            }
            sumaPedido+=9
            binding.labelCesta.text=sumaPedido.toString() + "€"
        }
        binding.mas3.setOnClickListener{
            contador3++
            Toast.makeText(this, "Hamburguesa Angus x$contador3",Toast.LENGTH_SHORT).show()
            binding.cont3.text=contador3.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
            str3="-> Hamburguesa Angus   x" + contador3 +" = "+11*contador3+  "€ \n\n"
            if (str3.contains("Hamburguesa Angus ")==true){
                str3=""
                str3+="-> Hamburguesa Angus   x" + contador3  +" = "+11*contador3+  "€ \n\n"
            }
            sumaPedido+=11
            binding.labelCesta.text=sumaPedido.toString() + "€"
        }
        binding.mas4.setOnClickListener{
            contador4++
            Toast.makeText(this, "Hamburguesa queso inyectado x$contador4",Toast.LENGTH_SHORT).show()
            binding.cont4.text=contador4.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
            str4="-> Hamburguesa queso inyectado   x"+ contador4 +" = "+12*contador4+  "€ \n\n"
            if (str4.contains("Hamburguesa queso inyectado ")==true){
                str4=""
                str4+="-> Hamburguesa queso inyectado   x" + contador4  +" = "+12*contador4+  "€ \n\n"
            }
            sumaPedido+=12
            binding.labelCesta.text=sumaPedido.toString() + "€"
        }
        binding.mas5.setOnClickListener{
            contador5++
            Toast.makeText(this, "Hamburguesa a la parrilla x$contador5",Toast.LENGTH_SHORT).show()
            binding.cont5.text=contador5.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
            str5="-> Hamburguesa a la parrilla    x" + contador5 +" = "+10*contador5+  "€ \n\n"
            if (str5.contains("Hamburguesa a la parrilla ")==true){
                str5=""
                str5+="-> Hamburguesa a la parrilla   x" + contador5  +" = "+10*contador5+  "€ \n\n"
            }
            sumaPedido+=10
            binding.labelCesta.text=sumaPedido.toString() + "€"
        }

            ////**********************QUITAR PEDIDO****************************************
            binding.menos1.setOnClickListener{
                if (contador > 0) {
                    contador--
                    Toast.makeText(this, "Hamburguesa con queso x$contador",Toast.LENGTH_SHORT).show()
                    binding.cont1.text=contador.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
                    str = "-> Hamburguesa con queso    x" + contador + " = " + 7 * contador + "€ \n\n"
                    if (str.contains("Hamburguesa con queso") == true) {

                        str += "-> Hamburguesa con queso    x" + contador + " = " + 7 * contador + "€\n\n"
                    }
                    sumaPedido -= 7
                    binding.labelCesta.text = sumaPedido.toString() + "€"
                }else{
                    str=""
                }
            }//Boton-
        binding.menos2.setOnClickListener {
            if (contador2 > 0) {
                contador2--
                Toast.makeText(this, "Hamburguesa doble x$contador2",Toast.LENGTH_SHORT).show()
                binding.cont2.text=contador2.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
                str2 = "-> Hamburguesa doble   x" + contador2 + " = " + 9 * contador2 + "€ \n\n"
                if (str2.contains("Hamburguesa doble ") == true) {
                    str2 = ""
                    str2 += "-> Hamburguesa doble    x" + contador2 + " = " + 9 * contador2 + "€ \n\n"
                }
                sumaPedido -= 9
                binding.labelCesta.text = sumaPedido.toString() + "€"
            }
        }
        binding.menos3.setOnClickListener {
            if (contador3 > 0) {
                contador3--
                Toast.makeText(this, "Hamburguesa Angus x$contador3",Toast.LENGTH_SHORT).show()
                binding.cont3.text=contador3.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
                str3 = "-> Hamburguesa Angus   x" + contador3 + " = " + 11 * contador3 + "€ \n\n"
                if (str3.contains("Hamburguesa Angus ") == true) {
                    str3 = ""
                    str3 += "-> Hamburguesa Angus   x" + contador3 + " = " + 11 * contador3 + "€ \n\n"
                }
                sumaPedido -= 11
                binding.labelCesta.text = sumaPedido.toString() + "€"
            }
        }
        binding.menos4.setOnClickListener {
            if (contador4 > 0) {
                contador4--
                Toast.makeText(this, "Hamburguesa queso inyectado x$contador4",Toast.LENGTH_SHORT).show()
                binding.cont4.text=contador4.toString() //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
                str4 = "-> Hamburguesa queso inyectado   x" + contador4 + " = " + 12 * contador4 + "€ \n\n"
                if (str4.contains("Hamburguesa queso inyectado ") == true) {
                    str4 = ""
                    str4 += "-> Hamburguesa queso inyectado   x" + contador4 + " = " + 12 * contador4 + "€ \n\n"
                }
                sumaPedido -= 12
                binding.labelCesta.text = sumaPedido.toString() + "€"
            }
        }
        binding.menos5.setOnClickListener {
            if (contador5 > 0) {
                contador5--
                Toast.makeText(this, "Hamburguesa a la parrilla x$contador5",Toast.LENGTH_SHORT).show()
                binding.cont5.text=contador5.toString()   //LABEL QUE NOS DICE LA CANTIDAD DE CADA UNO
                str5 = "-> Hamburguesa a la parrilla    x" + contador5 + " = " + 10 * contador5 + "€ \n\n"
                if (str5.contains("Hamburguesa a la parrilla ") == true) {
                    str5 = ""
                    str5 += "-> Hamburguesa a la parrilla   x" + contador5 + " = " + 10 * contador5 + "€ \n\n"
                }
                sumaPedido -= 10
                binding.labelCesta.text = sumaPedido.toString() + "€"
            }
        }



        binding.bCesta.setOnClickListener{

            var intent= Intent(this,Cesta::class.java)
            //Datos que vamos a sacar.
            var sumaPedidoIntent= sumaPedido.toString()
            var listadoIntent= str
            var listadoIntent2= str2
            var listadoIntent3= str3
            var listadoIntent4= str4
            var listadoIntent5= str5

            //Creamos bundle donde guardarlo todoo
            val b: Bundle= Bundle()

            //asignamos etiqueta y valores.
            b.putString("sumaPedido",sumaPedidoIntent)
            b.putString("listado",listadoIntent)
            b.putString("listado2",listadoIntent2)
            b.putString("listado3",listadoIntent3)
            b.putString("listado4",listadoIntent4)
            b.putString("listado5",listadoIntent5)
            //Lo cargamos en el intent
            intent.putExtras(b)
            startActivity(intent)
        }
    }
}


