package com.example.company.myapplication


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*fun handler(parent : AdapterView<*>, view: View, position: Int, id: Long){
        /*
        val myIntent = Intent(this, ListItemActivity::class.java)
        myIntent.putExtra("elem",  id.toString())
        startActivity(myIntent)
        */
        dataSet.add(dataSet[listView.checkedItemPosition])
        adapter.notifyDataSetChanged()

    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dataSet: MutableList<String> = MutableList(11, {x -> (x*x).toString()})
        var adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataSet)


        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            dataSet.add(dataSet[position])
            adapter.notifyDataSetChanged()
        }

    }
}
