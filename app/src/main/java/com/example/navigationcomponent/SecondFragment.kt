package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val tvSecond = view.findViewById<TextView>(R.id.tv_second)
        val tvData = view.findViewById<TextView>(R.id.tv_data)


        tvData.text = args.text //


        tvSecond.setOnClickListener(){


            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)

        }

        return view
    }


}