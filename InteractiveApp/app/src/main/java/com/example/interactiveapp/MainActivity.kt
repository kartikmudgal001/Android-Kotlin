package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout

//This app has two buttons, to switch between light and dark theme
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.button_dark)
        val buttonLight = findViewById<Button>(R.id.button_light)
        val layout = findViewById<LinearLayout>(R.id.linear_layout)

        buttonLight.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)


        }
        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)


        }
    }
}