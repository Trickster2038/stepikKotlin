package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    fun handler1(v: View){
        val myIntent = Intent(this, ThirdActivity::class.java)
        startActivity(myIntent)
    }
    fun handler2(v: View){
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button_next2.setOnClickListener(this::handler1)
        button_prev2.setOnClickListener(this::handler2)


    }
}
