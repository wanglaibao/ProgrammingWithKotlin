package com.laibao.kotlin.functions.extensionfunction

import java.lang.RuntimeException

fun main() {
    val user = User()
    user.logError(RuntimeException(),message = "金戈")


    A().foo() // Prints: foo from A

    B().foo() // Prints: foo from B

    C.foo()
}

class User


open class A {
    open fun foo() {
        println("foo from A")
    }
}

class B: A() {
    override fun foo() {
        println("foo from B")
    }
}

fun B.foo() {
    println("foo from Extension")
}

fun A.foo() {
    println("foo from Extension")
}





fun Any?.logError(error: Throwable, message: String = "error") {

    val name = this?.javaClass?.simpleName ?: "null"

    println("$name  $message  $error")
}

class C {
    companion object {}
}

fun C.Companion.foo() {
    println("我是金戈我扩展了伴生对象")
}