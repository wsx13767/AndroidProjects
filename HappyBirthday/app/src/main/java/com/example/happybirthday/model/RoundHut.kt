package com.example.happybirthday.model

import java.lang.Math.PI
import kotlin.math.sqrt

open class RoundHut(residents: Int, val radius: Double): Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }
}