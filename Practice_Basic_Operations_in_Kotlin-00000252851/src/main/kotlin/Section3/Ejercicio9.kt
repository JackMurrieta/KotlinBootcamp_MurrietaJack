package edu.itson.jackMurrieta.Section3


fun main() {
    val fortune = getFortuneCookie();
}

fun getFortuneCookie(): String {
    // 4. Lista de fortunas
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    // 5. print (no println) para que el cursor quede en la misma línea
    print("Enter your birthday: ")

    // 6-7. Leer el input; si no es un número válido, birthday = 1
    // readLine() devuelve String?; toIntOrNull() devuelve null si no se puede convertir
    val birthday = readLine()?.toIntOrNull() ?: 1

    // 8. El resto de dividir birthday entre la cantidad de fortunas nos da un índice válido
    val index = birthday % fortunes.size

    // 9. Devolver la fortuna correspondiente
    return fortunes[index]
}