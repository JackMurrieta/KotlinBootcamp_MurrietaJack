package edu.itson.jackMurrieta.Modulo5.Buildings

open class BaseBuildingMaterial(
    val numberNeeded: Int = 1
)

class Wood : BaseBuildingMaterial(4)

class Brick : BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(
    val material: T
) {

    val baseMaterialsNeeded: Int = 100

    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

fun main() {
    val building = Building(Wood())

    building.build()
}