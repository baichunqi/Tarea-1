package com.example.girdlayout6

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.gridlayout.widget.GridLayout
import java.util.Random

class MainActivity : AppCompatActivity() {
    private val colorButtons = ArrayList<Button>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resetButton = Button(this)
        for (i in 0 until 17) {
            addButtonWithRandomColor()
        }
        resetButton.setBackgroundColor(Color.WHITE)
        resetButton.setText(R.string.reset)
        findViewById<GridLayout>(R.id.gridLayout).addView(resetButton)
        resetButton.setOnClickListener {
            resetColors()
        }
    }

    private fun addButtonWithRandomColor() {
        val button = Button(this)
        colorButtons.add(button)
        val randomColor = generateRandomColor()
        button.setBackgroundColor(randomColor)
        button.setOnClickListener {
            button.setBackgroundColor(Color.WHITE)
        }
        findViewById<GridLayout>(R.id.gridLayout).addView(button)
    }

    private fun generateRandomColor(): Int {
        val random = Random()
        val red = random.nextInt(256)
        val green = random.nextInt(256)
        val blue = random.nextInt(256)
        return Color.rgb(red, green, blue)
    }

    private fun resetColors() {
        for (button in colorButtons) {
            val randomColor = generateRandomColor()
            button.setBackgroundColor(randomColor)
        }
    }
}