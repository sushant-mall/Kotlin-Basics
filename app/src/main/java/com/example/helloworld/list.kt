package com.example.helloworld

fun main()
{
    val name = mutableListOf("Sushant", "Ayush", "Karan")
    name.add("Manjesh") //adds an element in list
    println(name)
    for(lo in name)//lo represents the elements in list
    {
        println(lo[1].toUpperCase())//converts the letter at 1st index in the element to uppercase
    }
}