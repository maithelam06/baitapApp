package com.example.lab3

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var imgDice: ImageView
    private lateinit var btnRoll: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Ánh xạ view
        imgDice = findViewById(R.id.imgDice)
        btnRoll = findViewById(R.id.btnRoll)

        //Hiển thị mặt ban đầu (tuỳ chọn)
        showDiceFace(1)

        //Bắt sự kiện click
        btnRoll.setOnClickListener {
            rollDice()
        }
    }
    //Hàm xử lý đổ xúc xắc
    private fun rollDice() {
        val result = Random.nextInt(1, 7) // 1..6
        showDiceFace(result)
    }

     //Hàm hiển thị ảnh theo mặt xúc xắc
    private fun showDiceFace(face: Int) {
        val drawableId = when (face) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgDice.setImageResource(drawableId)
        // (tuỳ chọn) cho dễ truy cập:
        imgDice.contentDescription = "Dice face $face"
    }
}
