package com.example.helloworld

fun main(){
    val average = ArrayList<Double>(5)
    average.add(13.22)
    average.add(14.23)
    average.add(13.65)
    average.add(19.87)
    average.add(17.64)
    var sum = 0.0
    for(i in average){
        sum += i
    }
    var output = sum/5
    println("The average of the elements are $output")
}