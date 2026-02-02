package com.example.baitap

val number = listOf(1,2,3,4,5,6)

val color = listOf("red","blue","black")
val reversedColors = color.reversed()

val entrees = mutableListOf<String>()





fun main() {
    println(number.size)
    println(number[0])
    println(reversedColors)
    entrees.add("add phan tu 1")
    println(entrees)

    entrees[0] = "lasagna"
    println(entrees)

    entrees.remove("lasagna")
    println(entrees)


}
