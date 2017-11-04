package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
fun main(args: Array<String>) {
    val student = Student.create("WangLaiBao")
    student.printMessage()
    println(student.name)
}