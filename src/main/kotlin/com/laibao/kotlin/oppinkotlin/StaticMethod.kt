package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */

fun showFirstCharacter(input:String):Char{
    if(input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}