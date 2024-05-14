package com.example.exerciciomodulo8

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.PaginaInicial)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val textTittle = findViewById<TextView>(R.id.textoDigitado)
        val button = findViewById<Button>(R.id.button)
        val textCamp = findViewById<TextView>(R.id.TextEntry)
        var numClicks = 0
        var menuPrincipal: ConstraintLayout? = null
        menuPrincipal = findViewById(R.id.PaginaInicial)

        button.setOnClickListener {
            numClicks++
            textTittle.text = textCamp.text.toString() + " " + numClicks.toString()
            when(numClicks % 2) {
                0 -> menuPrincipal?.background = getDrawable(R.drawable.b1)
                1 -> menuPrincipal?.background = getDrawable(R.drawable.b2)
                2 -> menuPrincipal?.background = getDrawable(R.drawable.b3)
            }

        }

    }

}