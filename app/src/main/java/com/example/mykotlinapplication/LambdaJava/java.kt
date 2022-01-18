package com.example.mykotlinapplication.LambdaJava

import android.util.Log


class LambdaJava {
    fun main() {
        val op = Operation { x: Int, y: Int -> x + y }
        run { val z: Int = op.calculate(1, 2) }
        val z: Int = op.calculate(1, 2)
        Log.d("mylogs", z.toString() + "")
    }
}

internal interface Operation {
    fun calculate(x: Int, y: Int): Int
}