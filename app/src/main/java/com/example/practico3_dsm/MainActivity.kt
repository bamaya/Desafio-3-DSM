package com.example.practico3_dsm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnsignup:Button
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsignup=findViewById(R.id.btnsignup)
        btnlogin=findViewById(R.id.btnlogin)

        btnsignup.setOnClickListener {
            val intent= Intent(this,SingUpActivity::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}