package com.example.assistandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.side_menu.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendarImageView=findViewById<View>(R.id.imageView_calendar)
        val burgerMenu=findViewById<View>(R.id.imageView_burger_menu)
        val addTasksFromMain=findViewById<View>(R.id.add_task_imageView)

        addTasksFromMain.setOnClickListener{
            val intent= Intent(this,AddTaskActivity::class.java)
            startActivity(intent)
            finish()
        }
        burgerMenu.setOnClickListener{
            val intent= Intent(this,SideMenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        calendarImageView.setOnClickListener{
            val intent= Intent(this,CalendarActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}