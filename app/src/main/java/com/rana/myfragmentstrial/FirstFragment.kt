@file:Suppress("DEPRECATION")

package com.rana.myfragmentstrial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val inflate =inflater.inflate(R.layout.fragment_first, container, false)
        val nav2_btn : Button = inflate.findViewById(R.id.fragOne_Bt)
        nav2_btn.setOnClickListener{
            val fragment = SecondFragment()
            val action = fragmentManager?.beginTransaction()
            action?.replace(R.id.nav_cont, fragment)?.commit()


            }

return inflate
    }

    }

