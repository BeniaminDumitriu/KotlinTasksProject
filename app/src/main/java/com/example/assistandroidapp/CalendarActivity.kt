package com.example.assistandroidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val calendarTaskImageView=findViewById<View>(R.id.imageView_tasks_calendar)
        val redirect_to_side_menu=findViewById<View>(R.id.calendar_burger_menu)
        val calendar_add_task=findViewById<View>(R.id.add_task_calendar)

        redirect_to_side_menu.setOnClickListener{
            val intent= Intent(this,SideMenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        calendar_add_task.setOnClickListener{
            val intent= Intent(this,AddTaskActivity::class.java)
            startActivity(intent)
            finish()
        }
        calendarTaskImageView.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

}
}