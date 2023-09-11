package com.example.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var contador:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById<Button>(R.id.button17)
        val texto:TextView = findViewById<TextView>(R.id.textView10)

        boton.setOnClickListener{
            contador += 1
            texto.text = contador.toString()
        }
    }
}