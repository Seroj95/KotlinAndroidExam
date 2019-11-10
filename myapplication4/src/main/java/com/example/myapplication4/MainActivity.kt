package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var listofPizza=ArrayList<Pizza>()
    var adapter:PizzaAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listofPizza.add(Pizza(Utils.TITLE,Utils.DESCREPTION,R.drawable.pizza1))
        listofPizza.add(Pizza(Utils.TITLE_1,Utils.DESCREPTION_1,R.drawable.pizza2))
        listofPizza.add(Pizza(Utils.TITLE_2,Utils.DESCREPTION_2,R.drawable.pizza3))
adapter=PizzaAdapter(this,listofPizza)
        listView.adapter=adapter
    }
}
