package com.example.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var contador:Int = 0
    private var number1:String =""
    private var number2:String =""
    private var operation:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1: Button = findViewById<Button>(R.id.button1)
        val boton2: Button = findViewById<Button>(R.id.button2)
        val boton3: Button = findViewById<Button>(R.id.button3)
        val boton4: Button = findViewById<Button>(R.id.button4)
        val boton5: Button = findViewById<Button>(R.id.button5)
        val boton6: Button = findViewById<Button>(R.id.button6)
        val boton7: Button = findViewById<Button>(R.id.button7)
        val boton8: Button = findViewById<Button>(R.id.button8)
        val boton9: Button = findViewById<Button>(R.id.button9)
        val boton0: Button = findViewById<Button>(R.id.button0)

        val texto:TextView = findViewById<TextView>(R.id.Numero)

        boton1.setOnClickListener{

            texto.text = 1.toString()
        }
        boton2.setOnClickListener{

            texto.text = 2.toString()
        }
        boton3.setOnClickListener{

            texto.text = 3.toString()
        }
        boton4.setOnClickListener{

            texto.text = 4.toString()
        }
        boton5.setOnClickListener{

            texto.text = 5.toString()
        }
        boton6.setOnClickListener{

            texto.text = 6.toString()
        }
        boton7.setOnClickListener{

            texto.text = 7.toString()
        }
        boton8.setOnClickListener{

            texto.text = 8.toString()
        }
        boton9.setOnClickListener{

            texto.text = 9.toString()
        }
        boton0.setOnClickListener{

            texto.text = 0.toString()
        }

    }
}