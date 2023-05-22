package com.example.Lab1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
        @Parcelize
        data class Animals(
          val number: String,
          val name: String,
          val breed: String,
          ) : Parcelable
