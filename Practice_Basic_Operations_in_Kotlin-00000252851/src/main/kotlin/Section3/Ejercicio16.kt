package edu.itson.jackMurrieta.Section3

/**
 * Lista de tareas: Filtros sobre listas (para probar en REPL)
 */

fun main() {
    // 1. Lista de especias
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    // 2. Todos los "curry", ordenados por longitud del string
    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("Curries ordenados por longitud: $curries")
    // -> [curry, red curry, green curry]

    // 3. Especias que empiezan con 'c' y terminan en 'e' — dos formas distintas

    // Forma 1: una sola condición combinada con &&
    val startCendE_v1 = spices.filter { it.startsWith("c") && it.endsWith("e") }
    println("Empiezan con 'c' y terminan en 'e' (forma 1): $startCendE_v1")

    // Forma 2: encadenando dos filtros separados
    val startCendE_v2 = spices.filter { it.startsWith("c") }.filter { it.endsWith("e") }
    println("Empiezan con 'c' y terminan en 'e' (forma 2): $startCendE_v2")
    // -> [cayenne] en ambos casos

    // 4. Tomar los primeros tres elementos y quedarnos con los que empiezan con 'c'
    val firstThreeStartingWithC = spices.take(3).filter { it.startsWith("c") }
    println("Primeros 3 que empiezan con 'c': $firstThreeStartingWithC")
    // spices.take(3) -> [curry, pepper, cayenne]
    // filtrado -> [curry, cayenne]
}