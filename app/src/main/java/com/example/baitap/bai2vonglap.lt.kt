package com.example.baitap


val mylist = listOf("apple", "banana" , "orange")
var index = 0



fun main () {

    for (emlent in mylist) {
        println(emlent)
    }

    while (index < mylist.size) {
        println(mylist[index])
        index++
    }

    for (i in mylist.indices) {
        println("vi tri $i: ${mylist[i]}")
    }

    mylist.forEach { item ->
        println(item)
    }
}