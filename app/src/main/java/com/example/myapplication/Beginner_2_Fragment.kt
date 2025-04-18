package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class Beginner_2_Fragment : Fragment(R.layout.fragment_beginner_2) {
    override fun onViewCreated(view : View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonBack = view.findViewById<Button>(R.id.btn_back)
        buttonBack.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_out_left, R.anim.slide_in_right)
                .replace(R.id.frag_container, Beginner_1_Fragment())
                .commit()
        }
        val buttonEnd = view.findViewById<Button>(R.id.btn_end)
        buttonEnd.setOnClickListener {
//            parentFragmentManager.beginTransaction()
//                .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left)
//                .replace(R.id.frag_container, Beginner_1_Fragment())
//                .commit()
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
            requireActivity().finish();

        }
    }
}