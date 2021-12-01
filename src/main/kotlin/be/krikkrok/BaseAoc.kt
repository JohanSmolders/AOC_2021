package be.krikkrok

import java.io.Reader
import java.net.URL
import java.util.*

abstract class BaseAoc {
    fun asReader(location: String): Reader = BaseAoc::class.java.getResourceAsStream(location).reader()
    fun asStringList(location: String): LinkedList<String> {
        val linkedList = LinkedList<String>()
        asReader(location).forEachLine {
            linkedList.add(it)
        }
        return linkedList
    }

    fun asIntList(location: String) = asStringList(location).map { it.toInt() }

    fun asResource(location: String): URL = BaseAoc::class.java.getResource(location)
}