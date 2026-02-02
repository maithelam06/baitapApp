package com.example.baitap

abstract class Dwelling(val residents:Int) {
    abstract fun floorArea(): Double
}

class House(resident : Int , val width:Double, val heigh:Double)
    : Dwelling(resident) {
    override fun floorArea(): Double {
        return width*heigh
    }
}
fun main(){
    val house = House(4,5.0,6.0)
    println("so nguoi o ${house.residents}")
    println("dien tich san : ${house.floorArea()}")
}