package edu.itson.jackMurrieta

/**
 * Tarea 3: Nulabilidad
 *
 * 1. Intentar poner rainbowColor en null (no compila si es un String no-nullable).
 * 2. Declarar greenColor y blueColor, y asignarles null de dos formas distintas.
 */

fun main() {
    //var rainbowColor: String = "rojo"

    // Intentar esto NO compila, porque rainbowColor es String (no-nullable):
    // rainbowColor = null
    // Error del compilador: "Null can not be a value of a non-null type String"

    // Para permitir null hay que declarar el tipo como nullable, agregando "?"
    var rainbowColorNullable: String? = "rojo"
    rainbowColorNullable = null
    println("rainbowColorNullable: $rainbowColorNullable")

    // --- Dos formas diferentes de declarar variables en null ---

    // Forma 1: declarar el tipo explícitamente como nullable
    var greenColor: String? = null
    println("greenColor: $greenColor")

    // Forma 2: usar un cast a un tipo nullable para que Kotlin infiera el tipo
    var blueColor = null as String?
    println("blueColor: $blueColor")
}