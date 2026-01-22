package com.example.baitap

val peopleAges = mutableMapOf<String, Int>(
    "Fred" to 30,
    "Ann" to 23
)
fun main() {
    peopleAges.put("Barbara", 42) // thêm hoặc cập nhật
    peopleAges["Joe"] = 51        // thêm hoặc cập nhật
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames) // {Ann=23, Joe=51}
    val words = listOf("about", "acute", "balloon", "best", "brief", "class")

    val filteredWords = words
        .filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    

}