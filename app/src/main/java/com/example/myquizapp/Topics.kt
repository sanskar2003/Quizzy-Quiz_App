package com.example.myquizapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class Topics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics)
        val name: String? = intent.getStringExtra("name")
        val phy: TextView = findViewById(R.id.phy)
        phy.setShadowLayer(2f, 2f, 2f, Color.BLACK)
        phy.setOnClickListener {
            val intent = Intent(this, phy_QueS::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
        val chem: TextView = findViewById(R.id.chem)
        chem.setShadowLayer(2f, 2f, 2f, Color.BLACK)
        chem.setOnClickListener {
            val intent = Intent(this, chem_QueS::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
        val maths: TextView = findViewById(R.id.maths)
        maths.setShadowLayer(2f, 2f, 2f, Color.BLACK)
        maths.setOnClickListener {
            val intent = Intent(this, maths_QueS::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
        val gk: TextView = findViewById(R.id.gk)
        gk.setShadowLayer(2f, 2f, 2f, Color.BLACK)
        gk.setOnClickListener {
            val intent = Intent(this, gk_QueS::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
        val ss: TextView = findViewById(R.id.ss)
        ss.setShadowLayer(2f, 2f, 2f, Color.BLACK)
        ss.setOnClickListener {
            val intent = Intent(this, ss_QueS::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
        val grammar: TextView = findViewById(R.id.grammar)
        grammar.setShadowLayer(2f, 2f, 2f, Color.BLACK)
        grammar.setOnClickListener {
            val intent = Intent(this, grammar_QueS::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}