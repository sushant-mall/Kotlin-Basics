package com.example.helloworld

data class User(val id : Long,var name :String)

fun main(){
    val user1 = User(1609013020,"Sushant")
    println("User 1 is ${user1.name} and id is ${user1.id}")
    println(user1.component1())//will print the id
    println(user1.component2())//will print the name

}