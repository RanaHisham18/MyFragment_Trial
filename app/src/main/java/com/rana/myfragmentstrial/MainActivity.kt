package com.rana.myfragmentstrial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity(), FragmentListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        makeFragmentTransaction(FirstFragment.newInstance("Welcome to the first fragment"))
    }

    private fun makeFragmentTransaction(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onBtnClicked(number: Int) {
        when (number) {
            1 -> {
                makeFragmentTransaction(SecondFragment.newInstance("Welcome to the second fragment"))
            }
            2 -> TODO()
            3 -> TODO()
        }
    }
}