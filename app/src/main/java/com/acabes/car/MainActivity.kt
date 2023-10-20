package com.acabes.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        val secondFragment = ManufactureFragment()
        val btnSecondFragment = findViewById<Button>(R.id.btnFragmentTwo)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, secondFragment).commit()
        }



        btnSecondFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, secondFragment).addToBackStack(null).commit()
            }
        }
    }
}