package com.laibao.kotlin.functions.highorderfunction

fun main() {

    var fun1:(Int)->Int

    var fun2:()->Int

    var fun3:(Int)->Unit


    var todoList:List<() -> Unit> = mutableListOf()

    for (task in todoList) {
        task()
    }

}

class TestClass {

    lateinit var a: (Int) -> Int

    lateinit var b: ()->Int

    lateinit var c: (String)->Unit


    fun addCache(function: (Int) -> Int): (Int) -> Int {
        return function
    }

    fun cache1(funName:(String)->(Int)->Int) {

    }
}


