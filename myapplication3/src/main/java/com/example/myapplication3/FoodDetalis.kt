package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_detalis.*

class FoodDetalis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detalis)
        val bundle=intent.extras
        tvImage.setImageResource(bundle!!.getInt("image"))
       tvName.text= bundle!!.getString("name")
        tvDetalis.text=bundle!!.getString("des")
    }
}
