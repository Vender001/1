package com.example.Lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Lab1.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animal1 = intent.getParcelableExtra<Animals>(MainActivity.ANIMAL_KEY1)
        val animal2 = intent.getParcelableExtra<Animals>(MainActivity.ANIMAL_KEY2)
        val animal3 = intent.getParcelableExtra<Animals>(MainActivity.ANIMAL_KEY3)

        animal1?.let {
            val text =
                "№ ${animal1.number}," + "\n" + "name: ${animal1.name}," + "\n" + "breed: ${animal1.breed}"
            binding.textView9.text = text

        }

        animal2?.let {
            val text =
                "№ ${animal2.number}," + "\n" + "name: ${animal2.name}," + "\n" + "breed: ${animal2.breed}"
            binding.textView9.text = text

        }

        animal3?.let {
            val text =
                "№ ${animal3.number}," + "\n" + "name: ${animal3.name}," + "\n" + "breed: ${animal3.breed}"
            binding.textView9.text = text

        }


    }
}