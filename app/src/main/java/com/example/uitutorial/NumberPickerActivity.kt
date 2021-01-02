package com.example.uitutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_number_picker.*

class NumberPickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_picker)

        val colors = arrayOf("red", "green", "blue", "cyan", "magenta", "black")

        numberPicker.minValue = 0
        numberPicker.maxValue = colors.size - 1

        numberPicker.wrapSelectorWheel = false

        numberPicker.displayedValues = colors

        numberPicker.setOnValueChangedListener { picker, oldVal, newVal ->
            Toast.makeText(this, "Val is ${colors.get(newVal)}", Toast.LENGTH_SHORT).show()
        }

    }
}