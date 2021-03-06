package com.laibao.kotlin.functions.highorderfunction

fun main() {

    /**
     *  A lambda expression that takes no arguments and returns 1.
     *  Its type is ()->Int
     */
    { 1 }


    /**
     * A lambda expression that takes one argument of type String , and prints it. It returns Unit.
     * Its type is (String)->Unit
     */
    { str: String -> println(str) }

    /**
     * A lambda expression that takes two Int argument and returns the sum of them
     * Its type is (Int, Int)->Int
     */
    { a: Int, b: Int -> a + b }



    var a: (Int) -> Int = { i: Int -> i * 2 }
    a.invoke(1000)

    var b: ()->Int = { 4 }
    b.invoke()

    var c: (String)->Unit = { s: String -> println(s) }
    c.invoke("金戈")


    /**
     * Lambda expressions can be multiline
     * the result of Lambda expressions is the last line
     */
    val printAndReturn = {
        i: Int, j: Int -> println("I calculate $i + $j")
        i + j // 1
    }


    /**
     * Multiple statements can also be defined in a single line when they are separated by semicolons
     */
    val printAndReturn2 = {i: Int, j: Int -> println("I calculate $i + $j");i + j }
}