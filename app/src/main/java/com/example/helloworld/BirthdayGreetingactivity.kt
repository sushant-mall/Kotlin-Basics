package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greetingactivity.*

class BirthdayGreetingactivity : AppCompatActivity() {

    companion object  {const val NAME_EXTRA = "name_extra"} //static variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greetingactivity)

        val name = intent.getStringExtra(NAME_EXTRA) //this gets the name
        BirthdayGreeting.text = "Happy Birthday\n$name" //BirthdayGreeting is the id of text
    }
}