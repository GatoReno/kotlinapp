package com.example.mykotinapp

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var submit = findViewById<Button>(R.id.btnSumbit)
        var nameinput = findViewById<EditText>(R.id.inputText)
        var textView = findViewById<TextView>(R.id.textView)
        var text = nameinput.text
        submit.setOnClickListener {
            textView.text = text
        }
    }
}

