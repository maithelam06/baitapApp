package com.example.baitap

val numbers = listOf(0,3,8,4,0,5,5,8,9,2)
val setofNumber = numbers.toSet()


val set1 = setOf(1,2,3)

val set2 = mutableListOf(3,4,5)
val all = set1.union(set2)

val common = set1.intersect(set2)
val diff = set1.subtract(set2)

fun main() {
    println(setofNumber)
    set2.add(6)
    set2.remove(4)
    println(common)
    println(all)
    println(diff)
}