package com.example.helloworld

fun main(){
    val list = listOf<Int>(2,3,4,5,6,7,8,9)
    list.map { it*5 }.forEach({println("$it")})
}