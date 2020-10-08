package com.example.helloworld

//fun main()
//{
////    var mystring : String = "Android masterclass"
////    var myfloat : Float = 13.37F
////    var mydouble : Double = 3.14159293484
////    var mybyte : Byte = 25
////    var myshort : Short = 2020
////    var mylong : Long = 188383848
////    var myboolean : Boolean = true
////    var mychar : Char = 'a'
//
////    for(i in 0..10000)
////    {
////        if (i>9000)
////        println("Its over 9000!!!")
////
////    }
////    println("The code is executed successfully")
//
////    var humiditylevel = 80
//////    var humidity = "Humid"
//////    while (humidity=="Humid"){
//////         humiditylevel -= 5
//////        println("humidity decreased")
//////        if (humiditylevel <= 60){
//////            humidity = "Comfy"
//////            println("Its comfy now")
//////        }
//////    }
//
//
////    for (x in 0..9){
////        for (y in 0..9){
////            println("Result = ${x * y}")
////        }
////    }
//
//    var x = 0
//    for (y in 0..9) {
//        x += y
//    }
//
//    println("$x")
//
//}
fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")

}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
        chargeBattery(70)
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}
