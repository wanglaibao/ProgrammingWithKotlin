package com.laibao.kotlin.functions

import com.laibao.kotlin.oppinkotlin.Submarine
import java.util.*

/**
 * @author laibao wang
 */

fun <E> List<E>.drop(k:Int):List<E> {
    val resultSize = size - k
    when {
        resultSize <= 0 -> return emptyList<E>()
        else -> {
            val newList = ArrayList<E>(resultSize)
            for (index in k..size - 1) {
                newList.add(this[index])
            }
            return newList
        }
    }
}


fun Submarine.fire(): Unit {
    println("Fire on board!")
}

fun Submarine.submerge(depth: Int): Unit {
    println("Submerging to a depth of $depth fathoms")
}

fun Int.Companion.random(): Int {
    val random = Random()
    return random.nextInt()
}