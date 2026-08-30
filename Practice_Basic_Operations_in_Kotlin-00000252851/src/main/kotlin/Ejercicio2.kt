package edu.itson.jackMurrieta

class Ejercicio2 {

    fun ejercicio2() {
        var rainbowColor: String = "rojo";
        println("rainbowColor cambiado : ${rainbowColor}");

        rainbowColor = "violeta";
        println("rainbowColor cambiado : ${rainbowColor}");

        // val no se puede reasignar
        val blockColor: String = "negro";
        println("blockColor : ${blockColor}");
    }
}