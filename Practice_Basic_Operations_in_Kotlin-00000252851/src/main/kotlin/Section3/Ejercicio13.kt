package edu.itson.jackMurrieta.Section3

/**
 * Mejora de whatShouldIDoToday()
 *
 * 1. Se agregan 3 situaciones nuevas (marcadas con "NUEVO").
 * 2. Cada condición del when se extrae a su propia función de una sola
 *    expresión (single-expression function), y esa función se usa dentro
 *    del when.
 *
 * Challenge:
 * En vez de recibir mood como argumento fijo, se pide al usuario que lo
 * escriba, usando el operador !! (non-null assertion).
 */

fun main() {
    val mood = getMood()
    println(whatShouldIDoToday(mood))
    println(whatShouldIDoToday(mood, "rainy", 0))
    println(whatShouldIDoToday(mood, "sunny", 38))
    println(whatShouldIDoToday("bored", "snowy"))
}

// --- Challenge: leer el mood desde la entrada estándar ---
fun getMood(): String {
    print("How are you feeling today? ")
    // !! le dice al compilador "confío en que esto no es null".
    // Si readLine() devolviera null (por ejemplo, al llegar al fin de la
    // entrada), esta línea lanzaría un NullPointerException.
    return readLine()!!
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        // --- NUEVO: 3 situaciones agregadas ---
        isSadRainyFreezing(mood, weather, temperature) -> "Stay in bed and keep warm."
        isHot(temperature) -> "Go swimming to cool off."
        isBoredSnowy(mood, weather) -> "Build a snowman!"

        // --- Situaciones de la práctica anterior ---
        isHappySunny(mood, weather, temperature) -> "Go for a walk and enjoy the sun!"
        isHappyRainy(mood, weather) -> "Dance in the rain!"
        isSadSunny(mood, weather) -> "Go outside, the sunshine might cheer you up."
        isSad(mood) -> "Stay home and read."
        isEnergeticHot(mood, temperature) -> "Go for a swim."
        isEnergetic(mood) -> "Go for a run."
        isTired(mood) -> "Take a nap."
        isRainy(weather) -> "Watch a movie at home."
        isCold(temperature) -> "Stay warm indoors with a hot drink."

        else -> "Relax and do something you enjoy."
    }
}

// Funciones de una sola expresión, una por condición

// NUEVO
fun isSadRainyFreezing(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isHot(temperature: Int) = temperature > 35

fun isBoredSnowy(mood: String, weather: String) = mood == "bored" && weather == "snowy"

// De la práctica anterior
fun isHappySunny(mood: String, weather: String, temperature: Int) =
    mood == "happy" && weather == "sunny" && temperature > 20

fun isHappyRainy(mood: String, weather: String) = mood == "happy" && weather == "rainy"

fun isSadSunny(mood: String, weather: String) = mood == "sad" && weather == "sunny"

fun isSad(mood: String) = mood == "sad"

fun isEnergeticHot(mood: String, temperature: Int) = mood == "energetic" && temperature > 25

fun isEnergetic(mood: String) = mood == "energetic"

fun isTired(mood: String) = mood == "tired"

fun isRainy(weather: String) = weather == "rainy"

fun isCold(temperature: Int) = temperature < 10