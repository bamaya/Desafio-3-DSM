package com.example.practico3_dsm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var loginbtn:Button
    private lateinit var edituser:EditText
    private lateinit var editpass:EditText
    private lateinit var dbh:DbHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginbtn=findViewById(R.id.button4)
        edituser=findViewById(R.id.editusuario)
        editpass=findViewById(R.id.editpass)
        dbh= DbHelper(this)

        loginbtn.setOnClickListener {
          }
        }
    }