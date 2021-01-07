package com.example.mykotinapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var submit = findViewById<Button>(R.id.btnSumbit)
        var nameinput = findViewById<EditText>(R.id.editText1)
        var nameinput2 = findViewById<EditText>(R.id.editText2)


        submit.setOnClickListener {

            var title = nameinput.text.toString()
            var desc = nameinput2.text.toString()

            var intent = Intent(this, PostActivity::class.java)
            intent.putExtra("title", title)
            intent.putExtra("desc",desc)
            startActivity(intent)
        }
    }
}

