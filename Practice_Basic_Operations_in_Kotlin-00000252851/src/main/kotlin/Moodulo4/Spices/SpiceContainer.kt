package edu.itson.jackMurrieta.Moodulo4.Spices

// data class quiz 5

data class SpiceContainer(
    val spice : Spice
){
    val label: String
        get() = spice.nameSpice
}