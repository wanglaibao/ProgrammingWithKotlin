package com.laibao.kotlin.functions.highorderfunction

fun main() {

    val a: (Int) -> Int = fun(intValue: Int):Int { return  intValue * 200 }
    val aValue = a.invoke(100)
    println(aValue)

    val b: ()->Int = fun(): Int { return 4 }
    val bValue = b.invoke()
    println(bValue)

    val c: (String)->Unit = fun(s: String){ println(s) }
    c.invoke("金戈")
}