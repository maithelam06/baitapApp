package com.example.baitap

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun printlnHello() {
    println("xin chao")
}

fun roll(): Int {
    var random = (1..6).random()
    return random
}


val diceRange = 1..6
fun roll2() {
    val anotherNumber =diceRange.random()
    println(anotherNumber)
}


fun printBorder() {
    repeat(23) {
        print("=")
    }
}

fun printCake(age:Int , layer:Int) {
    repeat(layer) {
        repeat(age+2) {
            print("@")
        }
        println()
    }
}
fun roll3(): Int {
    return (1..6).random()
}

class Dice(var sides:Int) {
    fun roll():Int {
        return (1..sides).random()
    }
}
class Dice2(val number:Int) {
    fun roll1():Int {
        val randomNumber = (1..number).random()
        return randomNumber
    }
}

fun main() {
    println("This is the text to print!")
    var age = "5"
    var name = "lam"

    var roll = 6
    var rolvalue: Int = 4
    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")
    println("${roll}")
    println("${rolvalue}")

    printlnHello()

    printBorder("*", 10)
    println("hello lam")
    printBorder("-", 20)
    println("Done!")
    printBorder("=", 15)
    var ketqua = roll()
    println("ket qua la ${ketqua}")

    var ketqua1 = roll2()
    println("ket qua 2 la  ${ketqua1}")
    printBorder()
    println("hello lam")
    printBorder()
    printCake(3,4)

    val num =5
    if(num>4) {
        println("so nay lon hon 4")
    }else if(num==4) {
        println("so nay bang 4")
    }else {
        println("so nay be hon 4")
    }

    val luckyNumber = 3
    val rollResult = roll()

    println("You rolled: $rollResult")

    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
    }

    val dice = Dice(6)
    val result = dice.roll()
    print("ban gieo duoc : $result")
    val ketqua5 = Dice2(6)
    val ketqua6 = ketqua5.roll1()
    println("ket qua la ${ketqua6}")



}



