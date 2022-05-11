package com.example.assistandroidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AddTaskActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        val backArrow=findViewById<View>(R.id.back_from_add_task)
        val saveTask=findViewById<View>(R.id.add_task_imageView)

        saveTask.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        backArrow.setOnClickListener{
            val intent= Intent(this,CalendarActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}