package edu.itson.jackMurrieta.Modulo6

fun List<Int>.filterNumbers(action: (Int) -> Int): List<Int> {

    val result = mutableListOf<Int>()

    for (number in this) {
        if (action(number) == 0) {
            result.add(number)
        }
    }

    return result
}

fun main() {

    val numbers = listOf<Int>(
        1, 2, 3, 4, 5,
        6, 7, 8, 9, 0
    )

    val result = numbers.filterNumbers { number ->
        number % 3
    }

    println(result)
}