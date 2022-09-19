package com.keddad.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button);

        btn.setOnClickListener {
            val textInput = findViewById<EditText>(R.id.editTextTextPersonName)
            val textOutput = findViewById<TextView>(R.id.textView)

            textOutput.text = textInput.text
        }
    }
}