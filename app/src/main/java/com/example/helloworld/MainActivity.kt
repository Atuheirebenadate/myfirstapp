package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnbtmi: Button
    lateinit var btnSend:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbtmi=findViewById(R.id.btnbmi)
        btnbtmi.setOnClickListener {
            val intent=Intent(this,Calculatebmi::class.java)
            startActivity(intent)

        }

        btnSend=findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            val intent=Intent(this,sendMoney::class.java)
            startActivity(intent)
        }
    }
}