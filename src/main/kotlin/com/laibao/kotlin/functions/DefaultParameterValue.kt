package com.laibao.kotlin.functions

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
 * @author laibao wang
 */

class StudentOne(val name: String, val registered: Boolean, credits: Int) {
    constructor():this("jinge", false, 0)
    constructor(name: String): this(name, false, 0)
    constructor(name: String, registered: Boolean): this (name,registered, 0)
}

class StudentTwo(val name: String = "jinge", val registered: Boolean = false, credits: Int = 0)

fun main(args: Array<String>) {

}

fun createThreadPool(): ExecutorService {
    val threadCount = Runtime.getRuntime().availableProcessors()
    return createThreadPool(threadCount)
}

fun createThreadPool(threadCount: Int): ExecutorService = Executors.newFixedThreadPool(threadCount)

fun divide(divisor: BigDecimal, scale: Int = 0, roundingMode: RoundingMode = RoundingMode.UNNECESSARY): BigDecimal = BigDecimal.ZERO
















































































