package com.laibao.kotlin.oppinkotlin

import com.laibao.kotlin.functions.drop

/**
 * @author laibao wang
 */
fun main(args: Array<String>) {
    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    val droppedList = list.drop(5)
    droppedList.forEach { element -> println(element) }
}
