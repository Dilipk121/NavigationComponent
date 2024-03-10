package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.findFragment
import androidx.navigation.Navigation


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val tvFirst = view.findViewById<TextView>(R.id.tv_first)
        val etFirst = view.findViewById<EditText>(R.id.et_first)

        tvFirst.setOnClickListener() {

            val data = etFirst.text
            //FirstFragmentDirections : it will generate according to your fragment class
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("$data")

//            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)

            Navigation.findNavController(view).navigate(action)


        }

        return view
    }

}