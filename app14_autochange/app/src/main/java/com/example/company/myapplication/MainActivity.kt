package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var cnt:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                if(editText.text.toString().contains("question")){
                    editText.setText(editText.text.toString().replace("question", "answer"))
                    cnt++
                    editText.setSelection(editText.text.toString().length)
                }
                if(editText.text.toString().contains("request")){
                    editText.setText(editText.text.toString().replace("request", "response"))
                    cnt++
                    editText.setSelection(editText.text.toString().length)
                }
                if(editText.text.toString().contains("problem")){
                    editText.setText(editText.text.toString().replace("problem", "task"))
                    cnt++
                    editText.setSelection(editText.text.toString().length)
                }

                textView.setText(cnt.toString())


            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {


            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })

    }
}
