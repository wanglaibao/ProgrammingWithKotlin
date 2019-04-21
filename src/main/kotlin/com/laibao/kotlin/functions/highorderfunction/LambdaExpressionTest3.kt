package com.laibao.kotlin.functions.highorderfunction

fun main() {
    val a: (Int) -> Int = { it * 2 } // 1
    a(100)
    a.invoke(1000)

    val c: (String)->Unit = { println(it) } // 2
    c("")
    c.invoke("我是金戈")
}