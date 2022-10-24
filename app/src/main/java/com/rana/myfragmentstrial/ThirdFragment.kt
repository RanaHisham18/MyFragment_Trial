package com.rana.myfragmentstrial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


@Suppress("DEPRECATION")
class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
       val view3 = inflater.inflate(R.layout.fragment_third, container, false)

//        val nav3_btn: Button = view3.findViewById(R.id.fragOne_Bt)
//        nav3_btn.setOnClickListener {
//            val fragment = ThirdFragment()
//            val action = fragmentManager?.beginTransaction()
//            action?.replace(R.id.nav_cont, fragment)?.commit() }
          return view3
    }


            }

