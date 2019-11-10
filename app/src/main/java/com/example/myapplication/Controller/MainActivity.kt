package com.example.myapplication.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapters.CategoryAdapter
import com.example.myapplication.Adapters.CategoryReciclyerAdapter
import com.example.myapplication.R
import com.example.myapplication.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


val layoutManager= LinearLayoutManager(this)
        categoryListView.layoutManager=layoutManager
        categoryListView.setHasFixedSize(true)


        }
    }

