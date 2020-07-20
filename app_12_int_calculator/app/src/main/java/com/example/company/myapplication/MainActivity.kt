package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun addf(v: View){
        var s:String = ""
        if((arg1.text.toString().toIntOrNull() == null) || (arg2.text.toString().toIntOrNull()) == null){
            answer.text = "Input Error"
        } else {
            var res:Int
            res = arg1.text.toString().toInt() + arg2.text.toString().toInt()
            answer.text = res.toString()
        }
    }
    fun subtrf(v: View){
        var s:String = ""
        if((arg1.text.toString().toIntOrNull() == null) || (arg2.text.toString().toIntOrNull()) == null){
            answer.text = "Input Error"
        } else {
            var res:Int
            res = arg1.text.toString().toInt() - arg2.text.toString().toInt()
            answer.text = res.toString()
        }
    }
    fun mulf(v: View){
        var s:String = ""
        if((arg1.text.toString().toIntOrNull() == null) || (arg2.text.toString().toIntOrNull()) == null){
            answer.text = "Input Error"
        } else {
            var res:Int
            res = arg1.text.toString().toInt() * arg2.text.toString().toInt()
            answer.text = res.toString()
        }
    }
    fun dividef(v: View){
        var s:String = ""
        if((arg1.text.toString().toIntOrNull() == null) || (arg2.text.toString().toIntOrNull()) == null){
            answer.text = "Input Error"
        } else if(arg2.text.toString().toInt() == 0){
            answer.text = "Div by zero"
        } else {
            var res:Int
            res = arg1.text.toString().toInt() / arg2.text.toString().toInt()
            answer.text = res.toString()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener(this::addf)
        subtr.setOnClickListener(this::subtrf)
        mul.setOnClickListener(this::mulf)
        divide.setOnClickListener(this::dividef)



    }
}
