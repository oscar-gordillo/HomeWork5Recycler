package com.example.homework5recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    lateinit var result:Food
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        if(intent.hasExtra("food")){

            val temp = intent.getSerializableExtra("food")
            if (temp!=null) {
                result = temp as Food
                iv_img.setImageResource(result.image)
                tv_title_detail.text=result.name
                tv_detail.text=result.recipe
            }
        }
    }
}