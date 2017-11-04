package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
class KotlinSingleTon private constructor(){

    private val instance:KotlinSingleTon

    init {
        instance = KotlinSingleTon()
    }

    fun getInstance():KotlinSingleTon = instance

    fun printName():Unit {
        println("this is the singleton kotlin example")
    }
}