package edu.itson.jackMurrieta.Moodulo4.Spices


abstract class Spice(
    val nameSpice: String,
    val levelSpiciness: String
) : SpiceColor {
    abstract fun prepareSpice()

    fun calcularHeat(): Int {
        return if (levelSpiciness == "mild") {
            5
        } else {
            0
        }
 
    }
}