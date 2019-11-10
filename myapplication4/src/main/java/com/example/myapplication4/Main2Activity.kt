package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
val bundle=intent.extras
        textViewNam.text=bundle!!.getString("name")
        textViewDes.text=bundle!!.getString("desc")
    }
}
