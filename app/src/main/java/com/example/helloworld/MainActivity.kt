package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNextScreen = findViewById<Button>(R.id.start_progress)

        fun onClickAqui(view: View) {
            Toast.makeText(this, "Iniciando...", Toast.LENGTH_SHORT).show()
        }

        btnNextScreen.setOnClickListener {
            val i = Intent(this, NextActivity::class.java)
            startActivity(i)
        }

    }


}

