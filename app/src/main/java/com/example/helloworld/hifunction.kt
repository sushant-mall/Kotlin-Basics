package com.example.helloworld

fun main(){
    val output = operation(4,5, {a, b ->
        print("Adding these two numbers we get: ")
        a + b
    })
    print(output)
}

fun operation (a:Int, b:Int, operate:(Int,Int)->Int):Int{
    return operate(a,b)

}