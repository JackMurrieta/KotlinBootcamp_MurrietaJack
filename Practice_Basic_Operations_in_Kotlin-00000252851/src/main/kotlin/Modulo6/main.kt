package edu.itson.jackMurrieta.Modulo6

fun main() {

    val game = Game()

    println(game.path)

    game.north()
    game.east()
    game.south()
    game.west()
    game.end()

    println(game.path)
}