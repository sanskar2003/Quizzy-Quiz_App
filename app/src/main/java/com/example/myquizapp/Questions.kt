package com.example.myquizapp

data class Questions(
    val id : Int,
    val Question: String,
    val image: Int,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAns: Int
)
