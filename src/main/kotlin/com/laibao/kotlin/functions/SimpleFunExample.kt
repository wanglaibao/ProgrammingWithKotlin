package com.laibao.kotlin.functions

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val string = "a kindness of ravens"
    string.regionMatches(14, "Red Ravens", 4, 6, true)
    string.regionMatches(thisOffset = 14, other = "Red Ravens", otherOffset = 4, length = 6, ignoreCase = true)

    deleteFiles("*.jpg", true, true, false)

    deleteFiles("*.jpg", recursive = true, ignoreCase = true, deleteDirectories = false)

    val stringNamedParameter = "a kindness of ravens"

    stringNamedParameter.endsWith(suffix = "ravens", ignoreCase = true)

    stringNamedParameter.endsWith(ignoreCase = true, suffix = "ravens")
}

fun deleteFiles(filePattern: String, recursive: Boolean, ignoreCase: Boolean, deleteDirectories: Boolean): Unit {

}

fun hello():String = "hello,Kotlin"

fun hello(name: String, location: String) = "hello to you $name at $location"

fun printlnOne(str: String) = println(str)

fun printlnTwo(str: String) : Unit = println(str)

fun squareOne(x: Int) = x * x

fun squareTwo(x:Int):Int = x * x

fun squareThree(x:Int,y:Int):Int = x * y

fun concatOne(a: String, b: String) = a + b

fun concatTwo(a: String, b: String): String =  a + b

fun printAreaTwo(width: Int, height: Int): Unit {
    fun calculateArea(): Int = width * height
    val area = calculateArea()
    println("The area is $area")
}

fun parseInt(str : String?) : Int? {
//    try {
//        return Integer.parseInt(str)
//    }
//    catch (e : NumberFormatException) {
//        return null
//    }

    return str?.toInt()
}

