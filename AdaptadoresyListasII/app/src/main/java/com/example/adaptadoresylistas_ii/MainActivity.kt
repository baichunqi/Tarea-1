package com.example.adaptadoresylistas_ii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myList = findViewById<ListView>(R.id.myList)
        var valores = arrayOf("cosa1","objeto2","unidad3","elemento4", "valor5", "individuo6", "algo7", "desconocido8")

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, valores)
        myList.adapter = adapter
    }
}