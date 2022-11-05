package com.keddad.hw9

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText


class MainActivity : AppCompatActivity() {
    private val textIds = listOf(R.id.editTextTextPersonName, R.id.editTextTextPersonName2, R.id.editTextTextPersonName3)

    private var lastText: AppCompatEditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textIds.forEach {
            val textField = findViewById<AppCompatEditText>(it)
            registerForContextMenu(textField)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        if (item.itemId == R.id.clean) {
            textIds.forEach {
                val textField = findViewById<AppCompatEditText>(it)
                textField.setText("")
            }
        }

        return false
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.clean_field) {
            lastText!!.setText("")
        }

        if (item.itemId == R.id.reverse_field) {
            lastText!!.setText(lastText!!.text!!.reversed())
        }

        return false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.contextmenu, menu)

        lastText = v as AppCompatEditText?
    }
}