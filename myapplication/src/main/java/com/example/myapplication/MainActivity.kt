package com.example.myapplication


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animal_ticket.view.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

var listOfAnimals=ArrayList<Animal>()
    var adapter:AnimalsAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
listOfAnimals.add(Animal("Babon","Babon live is",R.drawable.pizza2,false))
listOfAnimals.add(Animal("Babon","Babon live is",R.drawable.pizza3,false))
listOfAnimals.add(Animal("Babon","Babon live is",R.drawable.pizza4,false))
listOfAnimals.add(Animal("Babon","Babon live is",R.drawable.pizza5,true))
listOfAnimals.add(Animal("Babon","Babon live is",R.drawable.pizza6,false))
listOfAnimals.add(Animal("Babon","Babon live is",R.drawable.pizza7,false))
adapter= AnimalsAdapter(this,listOfAnimals)



        tvListAnimal.adapter=adapter
    }
class AnimalsAdapter: BaseAdapter {
    var listOfAnimals=ArrayList<Animal>()
    var context:Context?=null

    constructor( context: Context?,  listOfAnimals: ArrayList<Animal> ) : super() {
        this.listOfAnimals = listOfAnimals
        this.context = context

}
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val animal=listOfAnimals[position]
        var  inflator =context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        var myView=inflator.inflate(R.layout.animal_ticket,null)
        myView.tvName.text=animal.name!!
        myView.tvDevs.text=animal.desc!!
        myView.ivAnimalImage.setImageResource(animal.image!!)
        val intent=Intent(context,AnimalInfo::class.java)
        intent.putExtra("name",animal.name!!)
        intent.putExtra("des",animal.desc!!)
        intent.putExtra("image", animal.image!!)
        context!!.startActivity(intent)
        return myView
    }

    override fun getItem(index: Int): Any {
return  listOfAnimals[index]
    }

    override fun getItemId(position: Int): Long {
      return position.toLong()
    }

    override fun getCount(): Int {
        return listOfAnimals.size
    }

}
}
