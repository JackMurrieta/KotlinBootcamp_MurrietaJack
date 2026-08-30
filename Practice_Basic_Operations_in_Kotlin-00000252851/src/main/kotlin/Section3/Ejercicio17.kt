package edu.itson.jackMurrieta.Section3

/**
 * Lista de tareas 1: Lambdas y rollDice
 */

val rollDiceV1 = {
    (1..12).shuffled().first()
}

val rollDice = { numSides: Int ->
    if (numSides == 0) {
        0
    } else {
        (1..numSides).shuffled().first()
    }
}

// 4. La misma lambda, pero usando la notación de tipo de función (function type) explícita
val rollDice2: (Int) -> Int = { numSides ->
    if (numSides == 0) {
        0
    } else {
        (1..numSides).shuffled().first()
    }
}

fun gamePlay(diceRoll: (Int) -> Int) {
    println("You rolled a ${diceRoll(12)}")
}

fun main() {
    println("rollDiceV1(): ${rollDiceV1()}")
    println("rollDice(6): ${rollDice(6)}")
    println("rollDice(0): ${rollDice(0)}")
    println("rollDice2(6): ${rollDice2(6)}")

    gamePlay(rollDice2)
    gamePlay(rollDice2)
    gamePlay(rollDice2)
}