package com.example.telinha1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun chageText(view: View) {
        val text = findViewById<TextView>(R.id.text1)
        text.text = "Lucas"
    }
}
