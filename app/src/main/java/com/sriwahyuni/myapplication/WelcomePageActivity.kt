package com.sriwahyuni.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomePageActivity : AppCompatActivity() {

    private lateinit var btnLogin : Button
    private lateinit var  btnSigin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)

        btnLogin = findViewById(R.id.btnLogin)
        btnSigin = findViewById(R.id.btnSigin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btnLogin.setOnClickListener {
            val intent = Intent(this, PageLogin::class.java)
            startActivity(intent)
        }


        btnSigin.setOnClickListener {
            val intent = Intent(this, PageRegister::class.java)
            startActivity(intent)
        }

    }
}