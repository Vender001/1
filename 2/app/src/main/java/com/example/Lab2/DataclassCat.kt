package com.example.Lab2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(
    val Name: String,
    val Number: Int,
    val Breed: String,
    val Description: String,
    val ResId: Int,

    ) : Parcelable

fun createGames(): List<Animal> {
    return listOf(
        Animal(
            "Steve",
            1,
            "British",
            "Beautiful cat",
            R.drawable.image1,

            ),

        Animal(
            "Santa",
            2,
            "Siamese",
            "Playful cat",
            R.drawable.image3,

            ),

        Animal(
            "Mason",
            3,
            "Sphinx",
            "Good cat",
            R.drawable.image2,

            )





    )
    

}