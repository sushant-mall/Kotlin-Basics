package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) { //onclick is set to createBirthdayCard func

        val name = nameInput.editableText.toString()

        val intent = Intent(this, BirthdayGreetingactivity::class.java)
        intent.putExtra(BirthdayGreetingactivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}