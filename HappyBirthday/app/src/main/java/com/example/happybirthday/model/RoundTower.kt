package com.example.happybirthday.model

class RoundTower(residents: Int, radius: Double, val floors: Int = 2): RoundHut(residents, radius) {
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}