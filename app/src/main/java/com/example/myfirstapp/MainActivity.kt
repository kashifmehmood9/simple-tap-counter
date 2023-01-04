package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.mybutton)
        val textView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        button.setOnClickListener {
            timesClicked++
            textView.text =  "$timesClicked"
            Toast.makeText(this,"Button Tapped", Toast.LENGTH_SHORT).show()
        }
    }
}
