package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val outerClass = OuterClass()
    outerClass.sayHello()
    println()

    val nestedClassOne = OuterClass.NestedClassOne()
    nestedClassOne.sayHelloInNestedOne()

    val nestedClassFour = OuterClass.NestedClassFour()
    nestedClassFour.sayHelloInNestedFour()
}


class TestNestedClass : OuterClass() {

    fun sayHehe() {
        NestedClassFive().sayHelloInNestedFive()
    }
}