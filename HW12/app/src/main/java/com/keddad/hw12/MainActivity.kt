package com.keddad.hw12

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        var player = MediaPlayer.create(this, R.raw.audio)
        player.isLooping = true

        btn.setOnClickListener {
            if (player.isPlaying) {
                player.pause()
            } else {
                player.start()
            }
        }
    }
}