package com.sriwahyuni.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageRegister : AppCompatActivity() {
    private lateinit var txtLogg : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_register)
        txtLogg = findViewById(R.id.txtLogg)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtLogg.setOnClickListener(){
            val intentMenu2 = Intent(this@PageRegister, PageLogin::class.java)
            startActivity(intentMenu2)
        }

    }
}