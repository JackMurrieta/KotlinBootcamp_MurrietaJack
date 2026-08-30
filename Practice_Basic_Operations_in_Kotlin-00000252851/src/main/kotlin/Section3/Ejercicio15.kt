package edu.itson.jackMurrieta.Section3

/**
 * Fortune Cookie con while
 *
 * El while es la mejor opción cuando queremos repetir "hasta que se
 * cumpla una condición", en vez de un número fijo de veces. Aquí no
 * necesitamos ningún break: la condición de salida se expresa
 * directamente en el encabezado del while.
 */

fun main() {
    var fortune = ""
    var count = 0

    while (count < 10 && !fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        count++
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    return fortunes[birthday % fortunes.size]
}