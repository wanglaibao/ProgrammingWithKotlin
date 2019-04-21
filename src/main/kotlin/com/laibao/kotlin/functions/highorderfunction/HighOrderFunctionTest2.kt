package com.laibao.kotlin.functions.highorderfunction

import java.math.BigDecimal

fun main() {

    val numbers = listOf(BD(1), BD(2), BD(3), BD(4))

    println(sumAccumulator(numbers)) // Prints: 10

    println(prodAccumulator(numbers)) // Prints: 24
}


fun sumAccumulator(numbers: List<BigDecimal>) = fold(numbers, BigDecimal.ZERO) { acc, num -> acc + num }


fun prodAccumulator(numbers: List<BigDecimal>) = fold(numbers, BigDecimal.ONE) { acc, num -> acc * num }

fun BD(i: Long) = BigDecimal.valueOf(i)

private fun fold(
        numbers: List<BigDecimal>,
        start: BigDecimal,
        accumulatorFunction: (BigDecimal, BigDecimal) -> BigDecimal
): BigDecimal {
    var acc = start

 /*
    for (num in numbers) {
        acc = accumulatorFunction(acc, num)
    }
  */

    numbers.forEach { acc = accumulatorFunction(acc, it) }

    return acc
}

fun longOperation(vararg observers: ()->Unit) {
    for(observer in observers) {
        //observer()
        observer.invoke()
    }
}



















