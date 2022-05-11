package com.example.assistandroidapp

import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registerTextView=findViewById<View>(R.id.goto_register)
        val buttonLogin=findViewById<Button>(R.id.login_button)

        buttonLogin.setOnClickListener{
            val intent=Intent(this,SplashActivity::class.java)
            startActivity(intent)
            finish()
        }

        registerTextView.setOnClickListener{
            val intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}