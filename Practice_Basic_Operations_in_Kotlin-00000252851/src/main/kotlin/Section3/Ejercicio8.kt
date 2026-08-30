package edu.itson.jackMurrieta.Section3

import java.util.Calendar

/**
 * Lista de tareas 1:
 * 1. Crear un nuevo archivo Kotlin.
 * 2. Copiar y pegar la función main() de Hello World.
 * 3. Crear una nueva función, dayOfWeek().
 * 4. En el cuerpo de la función, imprimir "What day is it today?"
 * 5. Llamar a dayOfWeek() desde main().
 * 6. Correr el programa.
 *
 */

fun main() {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")

    // Calendar.DAY_OF_WEEK devuelve un Int (1 = domingo, 2 = lunes, ... 7 = sábado)
    val today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (today) {
        Calendar.SUNDAY -> println("Today is Sunday")
        Calendar.MONDAY -> println("Today is Monday")
        Calendar.TUESDAY -> println("Today is Tuesday")
        Calendar.WEDNESDAY -> println("Today is Wednesday")
        Calendar.THURSDAY -> println("Today is Thursday")
        Calendar.FRIDAY -> println("Today is Friday")
        Calendar.SATURDAY -> println("Today is Saturday")
        else -> println("Unknown day")
    }
}