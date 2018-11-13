package com.laibao.kotlin.functions

/**
 * @author laibao wang
 */
object Rectangle {

    fun printlnArea(length:Int,width:Int):Unit {
        val area = calculateArea(length,width)
        println(area)
    }

    fun printlnVolumn(length:Int,width:Int,height:Int):Unit {
        fun calculateVolumn(length:Int,width:Int,height:Int):Int = length * width * height
        val volumn = calculateVolumn(length,width,height)
        println(volumn)
    }

    private fun calculateArea(length:Int,width:Int):Int = length * width

}