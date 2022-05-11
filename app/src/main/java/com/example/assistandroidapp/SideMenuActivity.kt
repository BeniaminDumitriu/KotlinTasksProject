package com.example.assistandroidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SideMenuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.side_menu)

        val sidePersonalMenu=findViewById<View>(R.id.side_menu_personal)
        val sideWorkMenu=findViewById<View>(R.id.side_menu_work)
        val sideSchoolMenu=findViewById<View>(R.id.side_menu_school)
        val log_out = findViewById<View>(R.id.log_out_button)

        log_out.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        sidePersonalMenu.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        sideWorkMenu.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        sideSchoolMenu.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}