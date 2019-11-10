package com.example.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Category
import kotlinx.android.synthetic.main.category_list_view.view.*


class CategoryReciclyerAdapter(val context: Context,val category:List<Category>,val itemClick:(Category)->Unit) : RecyclerView.Adapter<CategoryReciclyerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
val view =LayoutInflater.from(context).inflate(R.layout.category_list_view,parent,false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return category.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(category[position],context)
    }

    inner class Holder(itemView: View,val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
val categoryImage=itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName =itemView?.findViewById<TextView>(R.id.categoryName)
        fun bindCategory(category: Category,context: Context){
            val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text=category.title
            itemView.setOnClickListener({itemClick(category)})
        }
    }
}