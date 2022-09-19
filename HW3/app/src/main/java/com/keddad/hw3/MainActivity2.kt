package com.keddad.hw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView = findViewById<TextView>(R.id.textView4)
        textView.setText("Hello there, " + intent.getStringExtra("text"))

        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            val newIntent = Intent(this, MainActivity::class.java)
            newIntent.putExtra("text", intent.getStringExtra("text"))
            startActivity(newIntent)
        }
    }
}