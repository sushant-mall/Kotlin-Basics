package com.example.helloworld

fun main(){
    val list = listOf<Int>(2,3,4,5,6,7,8,9)
    list.filter ({
        it % 2 ==0
    }).forEach({println("$it")})
}