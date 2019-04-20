package com.laibao.kotlin.functions.highorderfunction

fun main() {
    var i = 1
    val a: () -> Int = { ++i }
    println (i) // Prints: 1
    println (a()) // Prints: 2
    println (i) // Prints: 2
    println (a()) // Prints: 3
    println (i) // Prints: 3


    val b: (Int) -> Int = { i -> i * 2 } // 1

    val c: (String)->Unit = { s -> println(s) } // 2

    b(100)
    b.invoke(200)

    c("菜鸟")
    c.invoke("菜鸟来了")


    /**
     * The inferred type is ()->Int
     */
    val d = { 4 } // 1

    /**
     * The inferred type is (String)->Unit ,
     * because the parameter is typed as String , and the return type is Unit
     */
    val e = { s: String -> println(s) } // 2

    /**
     * The inferred type is (Int)->Int ,
     * because i is typed as Int , and the return type is Int
     */
    val f = { i: Int -> i * 2 } // 3
}