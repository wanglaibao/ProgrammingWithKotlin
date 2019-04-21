package com.laibao.kotlin.functions.highorderfunction

import java.math.BigDecimal

fun main() {
    // Usage
    val numbers = listOf(
            BigDecimal.TEN,
            BigDecimal.ONE,
            BigDecimal.valueOf(2)
    )

    println(numbers) //[10, 1, 2]

    println(prod(numbers)) // 20

    println(sum(numbers)) // 13

}

fun sum(numbers: List<BigDecimal>): BigDecimal {
    var sum = BigDecimal.ZERO
    numbers.forEach { sum += it}
    return sum
}


fun prod(numbers: List<BigDecimal>): BigDecimal {
    var prod = BigDecimal.ONE
    numbers.forEach { prod *= it }
    return prod
}













