package com.example.myapplication3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_food_detalis.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.foot_ticket.view.*

import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var adapter:FoodAdapter?=null
var listOfFoods=ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listOfFoods.add(Food("Tashir","sddddddddddddadfdf",R.drawable.pizza2))
        listOfFoods.add(Food("ssffr","sddddddddddddadfdf",R.drawable.pizza3))
        listOfFoods.add(Food("sfsfr","sddddddddddddadfdf",R.drawable.pizza4))
        listOfFoods.add(Food("ahir","sddddddddddddadfdf",R.drawable.pizza5))
        listOfFoods.add(Food("ashir","sddddddddddddadfdf",R.drawable.pizza6))
        listOfFoods.add(Food("Monaco","sddddddddddddadfdf",R.drawable.pizza7))
        adapter= FoodAdapter(this,listOfFoods)
        gvListFood.adapter=adapter
    }
    class FoodAdapter:BaseAdapter{
        var listOfFood=ArrayList<Food>()
        var context:Context?=null

        constructor(context: MainActivity, listOfFood: ArrayList<Food>) : super() {
            this.context = context
            this.listOfFood = listOfFood

        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
           val  food =this.listOfFood[position]
           var inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
            var foodView=inflator.inflate(R.layout.foot_ticket,null)
            foodView.imageView.setImageResource(food.image!!)

            foodView.imageView.setOnClickListener{
 val intent=Intent(context,FoodDetalis::class.java)
                intent.putExtra("name",food.name!!)
                intent.putExtra("des",food.des!!)
                intent.putExtra("image",food.image!!)
               context!!.startActivity(intent)

            }
            foodView.tvName.text=food.name!!
            return  foodView
        }

        override fun getItem(position: Int): Any {
            return listOfFood[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return  listOfFood.size
        }

    }
}
