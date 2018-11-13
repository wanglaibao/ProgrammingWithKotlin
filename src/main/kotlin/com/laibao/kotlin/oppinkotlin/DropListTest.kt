package com.laibao.kotlin.oppinkotlin

import com.laibao.kotlin.functions.drop
import com.laibao.kotlin.functions.random
import com.laibao.kotlin.functions.submerge

/**
 * @author laibao wang
 */
fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    val droppedList = list.drop(5)
    droppedList.forEach { element -> println(element) }


    val sub = Submarine()
    sub.fire()
    sub.submerge()
    sub.submerge(1000)

    val intValue = Int.random()
    println(intValue)
}
