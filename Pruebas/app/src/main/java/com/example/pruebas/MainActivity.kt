package com.example.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number1:Int =0
    private var number2:Int =0
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
            number1 = 1
            texto.text = number1.toString()
        }
        boton2.setOnClickListener{
            number1 = 2
            texto.text = number1.toString()
        }
        boton3.setOnClickListener{
            number1 = 3
            texto.text = number1.toString()
        }
        boton4.setOnClickListener{
            number1 = 4
            texto.text = number1.toString()
        }
        boton5.setOnClickListener{
            number1 = 5
            texto.text = number1.toString()
        }
        boton6.setOnClickListener{
            number1 = 6
            texto.text = number1.toString()
        }
        boton7.setOnClickListener{
            number1 = 7
            texto.text = number1.toString()
        }
        boton8.setOnClickListener{
            number1 = 8
            texto.text = number1.toString()
        }
        boton9.setOnClickListener{
            number1 = 9
            texto.text = number1.toString()
        }
        boton0.setOnClickListener{
            number1 =0
            texto.text = number1.toString()
        }

    }

    override fun onResume(){
        super.onResume()
        Log.d("Debug","onResume")
        val text:TextView = findViewById(R.id.Numero)
        text.text = number1.toString()
    }
    override fun onSaveInstanceState(outState: Bundle) {
// Save the user's current game state.
        outState?.run {
            putInt("number1", number1)
        }
// Always call the superclass so it can save the view hierarchy.
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
// Always call the superclass so it can restore the view hierarchy.
        super.onRestoreInstanceState(savedInstanceState)
// Restore state members from saved instance.
        savedInstanceState?.run {
            number1 = savedInstanceState.getInt("number1")
        }
    }


}