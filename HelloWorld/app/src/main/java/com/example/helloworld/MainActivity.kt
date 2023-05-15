package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload = findViewById<Button>(R.id.button_upload)
        val buttonDownload = findViewById<Button>(R.id.button_download)

        buttonUpload.setOnClickListener {
            Toast.makeText(this, "uploading..", Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener {
            Toast.makeText(this, "downloading...", Toast.LENGTH_SHORT).show()
        }
    }
}