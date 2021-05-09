package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.happybirthday.model.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        // 擲第一顆骰子
        val diceRoll = Dice(6).roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)
        diceImage.apply {
            setImageResource(findId(diceRoll))
            contentDescription = diceRoll.toString()
        }

        // 擲第二顆骰子
        val diceRoll2 = Dice(6).roll()
        val diceImage2: ImageView = findViewById(R.id.imageView3)
        diceImage2.apply {
            setImageResource(findId(diceRoll2))
            contentDescription = diceRoll2.toString()
        }


    }

    /**
     * @param diceRoll 骰子的數字
     * 依骰子數字回傳指定圖片的ID
     */
    private fun findId(diceRoll: Int) = when (diceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

}