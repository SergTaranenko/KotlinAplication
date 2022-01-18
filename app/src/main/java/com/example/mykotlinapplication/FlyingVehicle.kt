package com.example.mykotlinapplication

interface FlyingVehicle {
    val maxHeight: Float
    val maxSpeed: Float

    val greeting: String
        get() = "Бум бум"

    fun speed(weight: Float): Float
}

interface Military {

}