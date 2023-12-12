package com.example.vp_alp.model

data class Restaurant_review(
    val id:Int,
    val user: User,
    val restaurant: Restaurant,
    val content:String,
    val rating:Float
)
