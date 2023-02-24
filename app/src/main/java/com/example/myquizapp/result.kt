package com.example.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text
import javax.xml.transform.Result

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val result: String? = intent.getStringExtra("Result")
        val name: String? = intent.getStringExtra("name")
        val textView: TextView = findViewById(R.id.result)
        textView.text = "Hi $name, Congratulations!!\nYour score is $result out of 10 marks."
        val textView2: TextView = findViewById(R.id.msg)
        if (result != null) {
            if(Integer.parseInt(result) > 7){
                textView2.text = "Very good performance!!"
            }
            else if(Integer.parseInt(result) in 4..7){
                textView2.text = "Good performance, need improvement!!"
            }
            else{
                textView2.text = "Bad performance!!"
            }
        }
    }
}