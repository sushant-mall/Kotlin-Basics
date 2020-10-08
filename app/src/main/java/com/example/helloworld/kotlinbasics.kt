package com.example.helloworld


fun main() {
    //println("Hello, world!!!")
    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changable)
    val myName = "Denis"
    // myName = "Michael" // ERROR: Val cannot be reassigned

    /* This is a multi line comment starts with /* and ends with *'/ without the '
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
    */ */
    var myAge = 31

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    //arithmetic operations
    val a = 5.0
    val b = 3.0
    var result: Double = (a / b).toDouble()
    //print(result)

    //comparison operator
    val isequal = 5 == 3
    //println("isequal is $isequal")

    val isnotequal = 5 != 2
    //println("isnotequal is $isnotequal")

    var myNum = 5
    myNum %= 3
    //print(myNum)
    //myNum++
    //print(myNum)
    //println("mynum is ${myNum++}")
    //println("mynum is ${++myNum}")

    var age:Int = 17
    if(age<=16){
        //println("You can drive a gearless vehicle")
    }
    else if (age in 17..19)
    {
        //println("You can drive a geared vehicle")
    }
    else{
        //println("Sit at home")
    }
    //when statements
    var name ="Karan"
    when(name){
//        "ayush" -> println("B.tech 3rd year")
//        "Sushant" -> println("B.tech 4th year")
//        else -> println("Manjesh Bsc 2nd Year")
    }


    //using when to check the data type
    var x :Any = 13.37
    when(x){
        is Int -> println("$x is an Integer")
        is Double -> println("$x is a Double")
        is String -> println("$x is an String")
        !is Float  -> println("$x is not a Float value")
    }
}