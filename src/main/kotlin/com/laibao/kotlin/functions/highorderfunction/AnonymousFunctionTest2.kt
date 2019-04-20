package com.laibao.kotlin.functions.highorderfunction

fun main() {
    var a = fun(i: Int) = i * 2
    a(123)
    a.invoke(1000)

    var b = fun(): Int { return 4 }
    b()
    b.invoke()

    var c = fun(s: String){ println(s) }
    c("金戈")
    c.invoke("jinge")

    var d:(Int) -> Int = fun(i) = i * 2
    d(100)
    d.invoke(1200)

    var e:(String) -> Unit = fun(s){ println(s) }
    e("中国人")
    e.invoke("中国中国人")
}