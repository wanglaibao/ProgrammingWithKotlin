package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
class Student private constructor(val name: String){

    companion object {
        fun create(name: String):Student = Student(name)
    }

    fun printMessage():Unit {
        println("hello,this is the singleton example of kotlin")
    }
}