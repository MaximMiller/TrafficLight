package com.example.trafficlight


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.trafficlight.R.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val btnRed: Button = findViewById(id.red_button)
        val btnYellow: Button = findViewById(id.yellow_button)
        val btnGreen: Button = findViewById(id.green_button)
        val textViewChoice: TextView = findViewById(id.text_view_choice)
        val rootLayout: ConstraintLayout = findViewById(id.root_layout)

        fun onClick(btn: Button, color: Int) {
            btn.setOnClickListener {
                textViewChoice.text = "Фон изменился"
                rootLayout.setBackgroundColor(ContextCompat.getColor(applicationContext, color))
            }
        }
        onClick(btnRed, color.red)
        onClick(btnYellow, color.yellow)
        onClick(btnGreen, color.green)

    }

}





