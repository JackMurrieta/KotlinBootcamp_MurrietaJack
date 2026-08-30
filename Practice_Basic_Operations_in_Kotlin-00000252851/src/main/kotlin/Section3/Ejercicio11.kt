package edu.itson.jackMurrieta.Section3


val fortunes = listOf(
    "You will have a great day!",
    "Things will go well for you today.",
    "Enjoy a wonderful day of success.",
    "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.",
    "Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune."
)

fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

// 1. Solo se encarga de pedir y leer el cumpleaños
fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

// 2-4. Recibe el birthday como argumento y decide la fortuna con un when
fun getFortune(birthday: Int): String {
    return when (birthday) {
        28, 31 -> "These are your lucky numbers — today is your day to shine!"

        // Un rango también es una rama válida del when
        in 1..7 -> "A new beginning: the first week is your strongest week."

        // Igual que antes: calculamos la fortuna con el resto de la división
        else -> fortunes[birthday % fortunes.size]
    }
}