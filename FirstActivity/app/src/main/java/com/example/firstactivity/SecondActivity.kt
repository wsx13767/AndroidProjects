package com.example.firstactivity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.first_layout.*

class SecondActivity : BaseActivity() {
    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("param1", data1)
                putExtra("param2", data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


//        val extraData = intent.getStringExtra("extra_data")
//        Log.d("SecondActivity", "extra data is $extraData")
        intent.getStringExtra("param1")?.let { Log.d("SecondActivity", it) }
        Log.d("SecondActivity", "Task id is $taskId")
        setContentView(R.layout.activity_second)


        button2.setOnClickListener {
            val intent = Intent(this, ThridActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        Log.d("SecondActivity", "onDestroy")
        super.onDestroy()
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return", "Hello FirstActivity from backPressed")
        setResult(Activity.RESULT_OK, intent)
        finish()

    }
}