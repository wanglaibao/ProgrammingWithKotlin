package com.laibao.kotlin.oppinkotlin.delegation

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val panel = Panel(Rectangle(10,100,30,100))
    println("Panel height:"+panel.getHeight())
    println("Panel witdh:" + panel.getWidth())
}