package com.example.Lab1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Lab1.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animal1 = Animals(
             "1",
            "Steve",
              "British",
            )
        val animal2 = Animals(
             "2",
            "Santa",
              "Siamese",
              )
        val animal3 = Animals(
             "3",
            "Mason",
              "Sphinx",
              )

        binding.button1.setOnClickListener {
            val intent1 = Intent(this, SecondActivity::class.java)
            intent1.putExtra(ANIMAL_KEY1, animal1)
            startActivity(intent1)
        }
        binding.button2.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            intent2.putExtra(ANIMAL_KEY2, animal2)
            startActivity(intent2)
        }
        binding.button3.setOnClickListener {
            val intent3 = Intent(this, SecondActivity::class.java)
            intent3.putExtra(ANIMAL_KEY3, animal3)
            startActivity(intent3)
        }
    }
    companion object {
        val ANIMAL_KEY1 = "animal1"
        val ANIMAL_KEY2 = "animal2"
        val ANIMAL_KEY3 = "animal3"

    }
}



