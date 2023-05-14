package com.example.practico3_dsm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class SingUpActivity : AppCompatActivity() {

    private lateinit var name:EditText
    private lateinit var apellido:EditText
    private lateinit var email:EditText
    private lateinit var user:EditText
    private lateinit var pass:EditText
    private lateinit var spin: Spinner
    private lateinit var db:DbHelper
    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        name=findViewById(R.id.edtnombre)
        apellido=findViewById(R.id.edtapellido)
        email=findViewById(R.id.edtemail)
        user=findViewById(R.id.edtusuario)
        pass=findViewById(R.id.edtpass)
        spin=findViewById(R.id.spinner)
        button=findViewById(R.id.button3)

        db= DbHelper(this)
        button.setOnClickListener {
            val names = name.text.toString()
            val apellidos = apellido.text.toString()
            val emailtext = email.text.toString()
            val users = user.text.toString()
            val passtext = pass.text.toString()
            val savedata = db.insertdata(names, apellidos, emailtext, users, passtext)

            }
        }
    }
