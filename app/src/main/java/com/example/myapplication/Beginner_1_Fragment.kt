package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class Beginner_1_Fragment : Fragment(R.layout.fragment_beginner_1) {
    override fun onViewCreated(view : View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonNext = view.findViewById<Button>(R.id.btn_next)
        buttonNext.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left)
                .replace(R.id.frag_container, Beginner_2_Fragment())
                .commit()
        }
    }
}