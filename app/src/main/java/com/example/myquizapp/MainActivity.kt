package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.submit)
        val editText: EditText = findViewById(R.id.editTextTextPersonName)
        button.setOnClickListener {
            val name = editText.text
            if(name.isEmpty()){
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this@MainActivity, Topics::class.java)
                intent.putExtra("name", name.toString())
                startActivity(intent)
                editText.setText("")
            }
        }
    }
}
