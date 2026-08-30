package edu.itson.jackMurrieta

/**
 * Tarea 5: Operador Elvis (?:)
 */

fun main() {
    var nullTest: Int? = null

    // Operador Elvis: si "nullTest?.plus(1)" resulta null, se usa 0 en su lugar
    val resultado = nullTest?.plus(1) ?: 0
    println("nullTest es null -> resultado: $resultado")
    nullTest = 5
    val resultado2 = nullTest?.plus(1) ?: 0
    println("nullTest = 5 -> resultado: $resultado2")
}