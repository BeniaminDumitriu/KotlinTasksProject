package com.example.assistandroidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val loginTextView=findViewById<View>(R.id.goto_login)

        loginTextView.setOnClickListener{
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}