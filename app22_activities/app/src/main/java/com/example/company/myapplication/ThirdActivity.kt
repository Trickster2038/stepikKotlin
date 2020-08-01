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
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    fun handler1(v: View){
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
    }
    fun handler2(v: View){
        val myIntent = Intent(this, SecondActivity::class.java)
        startActivity(myIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        button_next3.setOnClickListener(this::handler1)
        button_prev3.setOnClickListener(this::handler2)


    }
}