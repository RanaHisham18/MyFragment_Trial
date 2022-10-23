package com.rana.myfragmentstrial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()


     // supportFragmentManager.beginTransaction().add(R.id.mainActivity_Layout, firstFragment).commit()
        supportFragmentManager.beginTransaction().
            replace(R.id.nav_cont, FirstFragment()).commit()





               }
 }