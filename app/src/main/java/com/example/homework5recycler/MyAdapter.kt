package com.example.homework5recycler

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.food_item.view.*

class MyAdapter(var context: Context, var text1 :Array<String>, var text2:Array<String>, var img:IntArray): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.food_item, parent, false)
        return MyViewHolder(v);
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.linearlayout.apply {
            tv_title.text=text1[position]
            iv_image.setImageResource(img[position])
        }
        holder.itemView.linearlayout.setOnClickListener{
            val intent = Intent(context, DetailActivity::class.java)
            val food=Food(text1[position],text2[position],img[position])

            intent.putExtra("food",food)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return text1.size
    }
}