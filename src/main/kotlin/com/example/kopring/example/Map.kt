package com.example.kopring.example

fun main() {

    val oldMap = mutableMapOf<Int, String>()
    // 가변 map
    oldMap[1] = "Monday"
    oldMap[2] = "Tuesday"

    // 불변 map
//    mapOf(1 to "Monday", 2 to "Tuesday")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries){
        println(key)
        println(value)
    }
}