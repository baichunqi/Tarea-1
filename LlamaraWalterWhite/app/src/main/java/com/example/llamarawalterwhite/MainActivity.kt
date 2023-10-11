package com.example.llamarawalterwhite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var calling:Boolean = false
        val texto : TextView = findViewById(R.id.textView)
        val walter:ImageView = findViewById(R.id.walterWhite)
        val call:ImageButton=findViewById(R.id.call)

        call.setOnClickListener{
            if(!calling){
                call.setImageResource(R.drawable.colgar_9)
                walter.setImageResource(R.drawable.walterwhite2_9)
                texto.text = getString(R.string.llamando)
                calling = true
            } else if(calling){
                call.setImageResource(R.drawable.ic_launcher)
                walter.setImageResource(R.drawable.walterwhite_9)
                calling = false
                texto.text = getString(R.string.terminada)
            }
        }

    }
}