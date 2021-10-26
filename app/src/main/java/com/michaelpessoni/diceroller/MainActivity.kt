package com.michaelpessoni.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.michaelpessoni.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.setOnClickListener {
            val randoInt = Random().nextInt(6) + 1
            binding.diceImage.setImageResource(
                when(randoInt) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
            )
        }
    }
}