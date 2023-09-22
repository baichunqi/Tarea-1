package com.example.elmejorjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val monster: RadioButton = findViewById(R.id.monster)
        val lol: RadioButton = findViewById(R.id.league)
        val titanfall : RadioButton = findViewById(R.id.titanfall)
        val civ6: RadioButton = findViewById(R.id.civilization)
        val texto:TextView = findViewById(R.id.textoGuay)
        val check:CheckBox = findViewById(R.id.darle)

        monster.setOnClickListener{
            texto.text = getString(R.string.monster )
        }

        lol.setOnClickListener{
            texto.text=getString(R.string.lol)
        }

        titanfall.setOnClickListener{
            texto.text=getString(R.string.titan_fall)
        }

        civ6.setOnClickListener{
            texto.text=getString(R.string.civ)
        }

        check.setOnClickListener{
            if (check.isChecked){
                texto.text=getString(R.string.checked)
            } else{
                texto.text=getString(R.string.unchecked)
            }

        }

    }
}