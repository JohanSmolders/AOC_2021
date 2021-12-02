package be.krikkrok.twentyone

import be.krikkrok.BaseAoc

class AOC2021_2A: BaseAoc() {
    init {
        var forward = 0
        var depth = 0
        asStringList("/2021/2021_2A.txt").forEach { command ->
            val commandAndValue = command.split(' ')
            when(commandAndValue[0]){
                "forward" -> forward += commandAndValue[1].toInt()
                "up" -> depth -= commandAndValue[1].toInt()
                "down" -> depth += commandAndValue[1].toInt()
            }
        }

        println("Manhattan: ${forward * depth}")
    }
}

fun main() {
    AOC2021_2A()
}