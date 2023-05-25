package com.example.kopring.example

fun main() {

    var numbers = listOf<Int>(100, 200)
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} and ${value}")
    }

    // 불변 리스트로 만든후 필요시에 가변 리스트로 변경한다.
    numbers.toMutableList()
}
