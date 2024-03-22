package com.app.oddandevenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber = findViewById<EditText>(R.id.etNumber).text
        val btnDetermine = findViewById<Button>(R.id.btnDetermine)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnDetermine.setOnClickListener {

            if (etNumber.toString().toInt() % 2 == 0) {
                tvResult.text = "The number ${etNumber} is even"
            }else{
                tvResult.text = "The number ${etNumber} is odd"
            }
        }
    }
}