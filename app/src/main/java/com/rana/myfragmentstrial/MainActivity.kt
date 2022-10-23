package com.rana.myfragmentstrial

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


      supportFragmentManager.beginTransaction().add(R.id.mainActivity_Layout, firstFragment).commit()

               val button1 : Button
               button1 = findViewById(R.id.btnFirst)
               button1.setOnClickListener{
               supportFragmentManager.beginTransaction().add(R.id.mainActivity_Layout, firstFragment).commit()

                   val button2 : Button
                   button2 = findViewById(R.id.btnSecond)
                   button2.setOnClickListener{
                       supportFragmentManager.beginTransaction().add(R.id.mainActivity_Layout, secondFragment).commit()
                   }

                   val button3 : Button
                   button3 = findViewById(R.id.btnThird)
                   button3.setOnClickListener{
                       supportFragmentManager.beginTransaction().add(R.id.mainActivity_Layout, thirdFragment).commit()
                   }

               }
} }