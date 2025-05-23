package com.raiovack.singlepageapp

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Main : AppCompatActivity(R.layout.act_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val linearLayout: LinearLayout = findViewById(R.id.linear_layout)
        val title: TextView = findViewById(R.id.title)

        val clickListener = View.OnClickListener { title.text = "Well done! Button Clicked!" }

        linearLayout.setOnClickListener(clickListener)
    }

}