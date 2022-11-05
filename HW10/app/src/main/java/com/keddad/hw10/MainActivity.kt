package com.keddad.hw10

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val text = findViewById<EditText>(R.id.editTextTextPassword)

        btn.setOnClickListener {
            val verRes = verifyPassword(text.text.toString())

            if (verRes == null) {
                text.setText("")
                Toast.makeText(this, "All is well!", Toast.LENGTH_SHORT).show()
            } else {
                val alert = AlertDialog.Builder(this)
                alert.setMessage(verRes)
                alert.setCancelable(false)
                alert.setNegativeButton("OK") { dialog, _ -> dialog.cancel() }
                alert.show()
            }
        }
    }

    fun verifyPassword(password: String) : String? {
        if (password.length < 6) {
            return "Your password should at least 6 chars!"
        }

        if(!password.contains(Regex("[0-9]"))) {
            return "Your password should contain some digits!"
        }

        if(!password.contains("cat")) {
            return "Your password is just lame."
        }

        return null
    }
}