package com.keddad.hw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var viewtext: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textEdit = findViewById<EditText>(R.id.editTextTextPersonName)
        val btn = findViewById<Button>(R.id.button)

        textEdit.setText(intent.getStringExtra("text"))

        btn.setOnClickListener {
            viewtext = textEdit.text.toString()
            val newIntent = Intent(this, MainActivity2::class.java)
            newIntent.putExtra("text", viewtext)
            startActivity(newIntent)
        }
    }
}