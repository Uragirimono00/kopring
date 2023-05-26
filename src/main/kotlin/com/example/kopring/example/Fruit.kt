package com.example.kopring.example

fun main() {
    val fruits = listOf(
            Fruit("사과", 1_000),
            Fruit("사과", 1_200),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}

    filterFruits(fruits, isApple)
}

private fun filterFruits(
        fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return fruits
}

//private fun filterFruits(
//        fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
//    val results = mutableListOf<Fruit>()
//    for (fruit in fruits) {
//        if (filter(fruit)) {
//            results.add(fruit)
//        }
//    }
//    return fruits
//}
data class Fruit(val name: String, val price: Int) {
}
