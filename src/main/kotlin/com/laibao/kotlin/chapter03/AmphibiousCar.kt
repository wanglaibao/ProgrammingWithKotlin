package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
class AmphibiousCar(val name: String) : Drivable,Sailable{

    override fun drive() {
        println("I am Driving")
    }

    override fun sail() {
        println("I am Sailing")
    }
}