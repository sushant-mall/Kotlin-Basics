package com.example.helloworld

import java.lang.IllegalArgumentException

fun main(){
    var mycar  = car()
    println("The owner of car is ${mycar.owner} & the brand of the car is ${mycar.mybrand}")
    mycar.maxspeed= 540
    println("Max speed is ${mycar.maxspeed}")

}
class car(){
    lateinit var owner :String // error-lateinit property owner has not been initialized

    val mybrand:String = "Audi"
    get() { //this is the custom getter if someone calls mybrand
        return field.toUpperCase()
    }
    //custom getter and setter
    var maxspeed:Int=250
    get()=field
    set(value){
        field=if (value>0) value

        else throw IllegalArgumentException("Max speed cannot be less than 0")
    }

    init { //var owner will not be initialized until we reach this part of the code
        this.owner="Sushant"
    }

}