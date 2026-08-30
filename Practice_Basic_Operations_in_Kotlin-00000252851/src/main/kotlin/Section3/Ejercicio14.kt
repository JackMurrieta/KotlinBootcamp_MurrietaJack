package edu.itson.jackMurrieta.Section3

fun main() {
    var fortune = ""

    // Workaround: usamos una etiqueta (label) + return@ para simular el break.
    // Como repeat() es inline, return@breaking puede "saltar" a través de
    // ella y terminar el bloque run{} por completo.
    run breaking@{
        repeat(10) {
            fortune = getFortune(getBirthday())
            println("\nYour fortune is: $fortune")
            if (fortune.contains("Take it easy")) return@breaking
        }
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