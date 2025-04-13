package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class Beginner_1_Fragment : Fragment(R.layout.fragment_beginner_1) {
    fun onViewCreate(view : View, savedInstanceState: Bundle?) {
        super.onCreate(view, savedInstanceState)
        val buttonNext = view.findViewById<Button>(R.id.btn_next)
        buttonNext.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frag_container, Beginner_2_Fragment())
                .commit()
        }
    }
}