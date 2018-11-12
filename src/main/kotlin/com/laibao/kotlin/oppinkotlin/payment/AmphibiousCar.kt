package com.laibao.kotlin.oppinkotlin.payment

/**
 * @author laibao wang
 */
class AmphibiousCar (val name:String) : Drivable,Sailable{

    override fun drive() {
        println("Driving...")
    }

    override fun saill() {
        println("Sailling...")
    }
}