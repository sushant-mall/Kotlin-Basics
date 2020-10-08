package com.example.helloworld

fun main(){
    val Ayush = Teacher("Ayush")
    Ayush.teach()
    val Karan=MathsTeacher("Karan")
    Karan.teach()
}
open class Teacher(open var name: String){
    open fun teach(){
        println(" $name Teaching....")
    }
}

class MathsTeacher(override var name: String) :Teacher(name){
    override fun teach() {
        println(" $name teaching maths")
    }
}
