package com.keddad.hw8

import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val intent = Intent(this.applicationContext, MyAppWidget::class.java)
            intent.action = AppWidgetManager.ACTION_APPWIDGET_UPDATE
            val widgetManager = AppWidgetManager.getInstance(this)
            val ids = widgetManager.getAppWidgetIds(
                ComponentName(
                    this,
                    MyAppWidget::class.java
                )
            )

            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, ids)
            this.sendBroadcast(intent)
        }
    }
}