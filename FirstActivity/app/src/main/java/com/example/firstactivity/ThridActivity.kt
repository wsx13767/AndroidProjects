package com.example.firstactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thrid.*

class ThridActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ThridActivity", "Task id is $taskId")
        setContentView(R.layout.activity_thrid)
        button3.setOnClickListener {
            ActivityCollector.finishAll()
        }
    }
}