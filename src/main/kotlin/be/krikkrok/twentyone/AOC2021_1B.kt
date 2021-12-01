
package be.krikkrok.twentyone

import be.krikkrok.BaseAoc

class AOC2021_1B: BaseAoc() {
    init {
        var previousWindowDepth = 0
        var increaseCount = 0

        asIntList("/2021/2021_1A.txt").windowed(3, 1).forEach { window ->
            val windowDepthTotal = window.sumOf { it }
            if(previousWindowDepth != 0 && previousWindowDepth < windowDepthTotal){
                increaseCount++
            }
            previousWindowDepth = windowDepthTotal
        }

        println("Increases: $increaseCount")
    }
}

fun main() {
    AOC2021_1B()
}