package com.example.uitutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCal.setOnClickListener {
            val intent: Intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        btnNumberPicker.setOnClickListener {
            val intent = Intent(this, NumberPickerActivity::class.java)
            startActivity(intent)
        }
    }
}