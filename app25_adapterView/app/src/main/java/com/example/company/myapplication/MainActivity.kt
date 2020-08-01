package com.example.company.myapplication

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_item.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    fun handler(parent : AdapterView<*>, view:View, position: Int, id: Long){
        val myIntent = Intent(this, ListItemActivity::class.java)
        myIntent.putExtra("elem",  (id+1).toString())
        startActivity(myIntent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dataSet: MutableList<String> = MutableList(7, {x -> (x+1).toString()})
        var adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataSet)
        listView1.adapter = adapter

        listView1.setOnItemClickListener(this::handler)

    }
}
