package edu.itson.jackMurrieta.Section3


/**
 * Lista de tareas: whatShouldIDoToday()
 *
 * Programa que sugiere una actividad según el estado de ánimo,
 * el clima y la temperatura.
 *
 * Nota: este archivo se reutilizará y se ampliará en la próxima práctica,
 * así que lo dejamos bien organizado.
 */

fun main() {
    // 5. Probar distintas combinaciones de argumentos
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("happy", "rainy"))
    println(whatShouldIDoToday("energetic", "sunny", 30))
    println(whatShouldIDoToday("tired", "cloudy", 15))
    println(whatShouldIDoToday("bored", "snowy", -2))
}

/**
 * 3. Tres parámetros:
 *    - mood: requerido
 *    - weather: opcional, por defecto "sunny"
 *    - temperature: opcional, por defecto 24 (Celsius)
 */
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    // 4. when sin argumento: cada rama es una condición booleana propia
    return when {
        mood == "happy" && weather == "sunny" && temperature > 20 ->
            "Go for a walk and enjoy the sun!"

        mood == "happy" && weather == "rainy" ->
            "Dance in the rain!"

        mood == "sad" && weather == "sunny" ->
            "Go outside, the sunshine might cheer you up."

        mood == "sad" ->
            "Stay home and read."

        mood == "energetic" && temperature > 25 ->
            "Go for a swim."

        mood == "energetic" ->
            "Go for a run."

        mood == "tired" ->
            "Take a nap."

        weather == "rainy" ->
            "Watch a movie at home."

        temperature < 10 ->
            "Stay warm indoors with a hot drink."

        else ->
            "Relax and do something you enjoy."
    }
}