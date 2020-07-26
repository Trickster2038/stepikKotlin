package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var s:String = ""
    var listEdit : Int = 0
    var buf: String = ""

    fun saveHandler(v : View){
        this.s = editText.text.toString()
        unsaved_changes_view.setText("All changes saved")
    }

    fun clearHandler(v : View){
        editText.setText("")
        unsaved_changes_view.setText("Unsaved changes")
    }

    fun loadHandler(v : View){
        editText.setText(this.s)
        unsaved_changes_view.setText("All changes saved")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //listEdit = editText.text.toString().replace(Regex("[^A-Za-zА-Яа-я0-9]"), " ").replace("  "," ").trim().split(" ").size;
                buf = editText.text.toString().replace(Regex("[^A-Za-zА-Яа-я0-9]"), " ").trim()
                while(buf.contains("  ")){
                    buf = buf.replace("  ", " ")
                }
                listEdit = buf.split(" ").size

                stats_view.setText(listEdit.toString())
                unsaved_changes_view.setText("Unsaved changes")

            }
        })

        save_button.setOnClickListener(this::saveHandler)
        clear_button.setOnClickListener(this::clearHandler)
        load_button.setOnClickListener(this::loadHandler)


    }
}
