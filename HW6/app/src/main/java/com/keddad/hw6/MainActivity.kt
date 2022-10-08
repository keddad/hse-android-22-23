package com.keddad.hw6

import android.animation.ObjectAnimator
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val t1 = findViewById<TextView>(R.id.textView2)
        val t2 = findViewById<TextView>(R.id.textView3)

        val rAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_center)

        button.setOnClickListener {
            t1.setTextColor(Color.rgb(Random.nextInt(0, 256), Random.nextInt(0, 256), Random.nextInt(0, 256)))
            t2.setTextColor(Color.rgb(Random.nextInt(0, 256), Random.nextInt(0, 256), Random.nextInt(0, 256)))

            val animator1 = ObjectAnimator.ofFloat(t1, "textSize", 12f)
            animator1.duration = 800
            animator1.start()

            val animator2 = ObjectAnimator.ofFloat(t2, "textSize", 12f)
            animator2.duration = 700
            animator2.start()

            button.startAnimation(rAnim)
        }
    }
}