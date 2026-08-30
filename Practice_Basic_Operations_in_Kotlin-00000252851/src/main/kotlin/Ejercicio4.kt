package edu.itson.jackMurrieta

/**
 * Tarea 4: Listas y null
 *
 * 1. Crear una lista con dos elementos que sean null, de dos formas distintas.
 * 2. Crear una lista que sea null (la lista en sí, no sus elementos).
 */

fun main() {
    // --- Forma 1: listOf con valores null, dejando que Kotlin infiera el tipo ---
    val listaA = listOf(null, null)
    println("listaA: $listaA")

    // --- Forma 2: declarando explícitamente el tipo de la lista como nullable ---
    val listaB: List<String?> = listOf(null, null)
    println("listaB: $listaB")

    // --- Ahora la lista misma es null (no sus elementos) ---
    var listaNula: List<String>? = null
    println("listaNula: $listaNula")
}