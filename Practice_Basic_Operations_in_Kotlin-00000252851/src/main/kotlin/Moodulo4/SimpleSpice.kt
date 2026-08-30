package edu.itson.jackMurrieta.Moodulo4

class SimpleSpice {
    var nameSpice: String = "curry"
    var levelSpiciness: String = "mild"
    var heat: Int = 0

    constructor()

    fun setName(name: String) {
        this.nameSpice = name
    }

    fun setLevel(level: String) {
        this.levelSpiciness = level
    }

    fun calcularHeat() {
        if (levelSpiciness == "mild") {
            this.heat = 5
        } else {
            this.heat = 0
        }
    }

    fun imprimir() {
        println("$nameSpice $heat")
    }
}