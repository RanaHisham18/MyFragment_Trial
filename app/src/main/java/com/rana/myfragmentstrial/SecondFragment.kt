package com.rana.myfragmentstrial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        val nav3_btn: Button = view.findViewById(R.id.fragOne_Bt)
        nav3_btn.setOnClickListener {

            val fragment = SecondFragment()
            val action = fragmentManager?.beginTransaction()
            action?.replace(R.id.nav_cont, fragment)?.commit() }
        return view


    }

}