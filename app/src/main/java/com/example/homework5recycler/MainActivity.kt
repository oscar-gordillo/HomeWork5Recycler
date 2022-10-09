package com.example.homework5recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var images = intArrayOf(
        R.drawable.coffee_pot,
        R.drawable.espresso,
        R.drawable.french_fries,
        R.drawable.honey,
        R.drawable.strawberry_ice_cream,
        R.drawable.sugar_cubes
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var s1 = resources.getStringArray(R.array.foods);
        var s2 = resources.getStringArray(R.array.detail);
        rv.layoutManager = GridLayoutManager(this,2)
        val adapter = MyAdapter(this,s1 , s2 ,images )
        rv.adapter = adapter

    }
}