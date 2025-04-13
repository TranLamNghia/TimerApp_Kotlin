package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Beginner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beginner)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.frag_container, Beginner_1_Fragment())
                .commit()
        }
    }
}