package com.laibao.kotlin.functions.extensionfunction

import java.lang.RuntimeException

class User

fun main() {
    val user = User()
    user.logError(RuntimeException(),message = "金戈")

}

fun Any?.logError(error: Throwable, message: String = "error") {

    val name = this?.javaClass?.simpleName ?: "null"

    println("$name  $message  $error")
}