package com.example.myapplication.Adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.model.Category

class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView:View
        val holder:ViewHolder
        if (convertView ==null){
            holder=ViewHolder()
            categoryView=LayoutInflater.from(context).inflate(R.layout.category_list_view,null)
            holder.categgoryImage =categoryView.findViewById(R.id.categoryImage)
            holder.categoryName=categoryView.findViewById(R.id.categoryName)
            println("ffdfdf")
            categoryView.tag=holder
        } else{
            holder=convertView.tag as ViewHolder
            categoryView=convertView
            println("Go to rexyler")
        }

        println("heaving Computing")
        val category =categories[position]
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
       holder.categgoryImage?.setImageResource(resourceId)

   holder.categoryName?.text=category.title

        return  categoryView
    }

    override fun getItem(position: Int): Any {
return categories[position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
return  categories.count()
    }
    private class ViewHolder{
        var categgoryImage :ImageView?=null
        var categoryName:TextView?=null
    }
}