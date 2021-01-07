package com.example.mykotinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.TextView

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        //fetch view components
        var title = findViewById<TextView>(R.id.title)
        var desc = findViewById<TextView>(R.id.desc)
        var btn = findViewById<Button>(R.id.btn)
        //store data from intent
        var gt = intent.getStringExtra("title")
        var gd = intent.getStringExtra("desc")
        //set data on view
        //title.setText(gt)
        //desc.setText(dt)

        title.text = gt
        desc.text =  gd

        btn.setOnClickListener{
            startActivity(Intent( this,MainActivity::class.java))
        }
    }
}