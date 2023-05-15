package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Method 1
    //    var createBirthdayButton = findViewById<Button>(R.id.createBirthdayButton)
//        createBirthdayButton.setOnClickListener {
//            val intent = Intent (this, Birthdaygreeting::class.java)
//            startActivity(intent)
        //Method 2

    }

    fun createBirthdayCard(view: View) {

//        val name = findViewById<EditText>(R.id.nameInput)
//        name.editableText.toString()
//
//        Toast.makeText(this, "name is $name ", Toast.LENGTH_LONG).show()
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name = nameInput.editableText.toString()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }

}