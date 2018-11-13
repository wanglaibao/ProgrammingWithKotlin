package com.laibao.kotlin.functions

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
