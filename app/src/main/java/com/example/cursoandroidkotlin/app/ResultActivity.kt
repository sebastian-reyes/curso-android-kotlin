package com.example.cursoandroidkotlin.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cursoandroidkotlin.R

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val nombre: String = intent.extras?.getString("EXTRA").orEmpty()
        tvResult.text = "Hola $nombre"
    }
}