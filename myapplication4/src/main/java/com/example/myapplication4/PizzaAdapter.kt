package com.example.myapplication4

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.pizza_reci_item.view.*

class PizzaAdapter : BaseAdapter {
    var listOfFood=ArrayList<Pizza>()
    var context:Context?=null

    constructor(context: Context?, listOfPizzaa: ArrayList<Pizza>) : super() {
        this.context = context
        this.listOfFood = listOfPizzaa

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val food=this.listOfFood[position]
       var  inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var foodView=inflator.inflate(R.layout.pizza_reci_item,null)
        foodView.imageView3.setImageResource(food.image!!)
        foodView.tvName.text=food.name!!
        foodView.tvDescreption.text=food.desc!!
        foodView.setOnClickListener{
            val intent =Intent(context,Main2Activity::class.java)
            intent.putExtra("name",food.name)
            intent.putExtra("desc",food.desc)
        }
        return foodView
    }

    override fun getItem(position: Int): Any {
       return listOfFood[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listOfFood.size
    }

}