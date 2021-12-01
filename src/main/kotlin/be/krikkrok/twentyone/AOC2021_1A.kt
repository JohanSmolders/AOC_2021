package be.krikkrok.twentyone

import be.krikkrok.BaseAoc

class AOC2021_1A: BaseAoc() {
    init {
        var previousDepth = 0
        var increaseCount = 0
        asIntList("/2021/2021_1A.txt").forEach { depth ->
            if(previousDepth != 0 && previousDepth < depth){
                increaseCount++
            }
            previousDepth = depth
        }

        println("Increases: $increaseCount")
    }
}

fun main() {
    AOC2021_1A()
}