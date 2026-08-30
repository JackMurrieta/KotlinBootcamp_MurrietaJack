package edu.itson.jackMurrieta.Moodulo4.Spices


sealed class Spice(
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