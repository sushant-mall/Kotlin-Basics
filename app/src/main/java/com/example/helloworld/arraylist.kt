package com.example.helloworld

fun main()
{
    val arrayList = ArrayList<String>()
    arrayList.add("Sushant")
    arrayList.add("Ayush")
    arrayList.add("Karan")
    arrayList.add("Manjesh")
    println("Printing friends arrayList....")
    for(i in arrayList){
        println(i)
    }
    println("Element at 2nd index is ${arrayList.get(2)}")//get function in array list prints element at index
}







