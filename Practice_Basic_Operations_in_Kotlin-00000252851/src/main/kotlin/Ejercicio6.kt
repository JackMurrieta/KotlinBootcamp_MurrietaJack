package edu.itson.jackMurrieta



fun main() {
    //Array de enteros del 11 al 15
    val numbers = intArrayOf(11, 12, 13, 14, 15)

    //Lista mutable vacía de Strings
    val numberStrings = mutableListOf<String>()

    //For loop que recorre el array y agrega cada número como String
    for (number in numbers) {
        numberStrings.add(number.toString())
    }

    println("numbers: ${numbers.joinToString()}")
    println("numberStrings: $numberStrings")
}


/**
 * Challenge: usar un for loop para crear una lista de los números
 * entre 0 y 100 que sean divisibles por 7.
 */

fun ejercicio7() {
    val divisiblesPor7 = mutableListOf<Int>()

    for (i in 0..100) {
        if (i % 7 == 0) {
            divisiblesPor7.add(i)
        }
    }
    println("Divisibles por 7 entre 0 y 100: $divisiblesPor7")
    println("Cantidad: ${divisiblesPor7.size}")
    val divisiblesPor7Alt = (0..100 step 7).toList()
    println("Alternativa con step: $divisiblesPor7Alt")
}