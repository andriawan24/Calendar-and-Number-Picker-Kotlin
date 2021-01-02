package com.example.uitutorial

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calendar.*
import java.text.SimpleDateFormat
import java.util.*

class CalendarActivity : AppCompatActivity() {
    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        calMain.setOnDateChangeListener { calendarView, year, month, day ->
            val cal: Calendar = GregorianCalendar(year, month, day)
            val dateFormatter = SimpleDateFormat("yyyy/MM/dd")

            Toast.makeText(this, dateFormatter.format(cal.time), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}