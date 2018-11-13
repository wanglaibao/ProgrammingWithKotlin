package com.laibao.kotlin.functions

/**
 * @author laibao wang
 */
fun main(args: Array<String>) {

}

fun printlnFizzBuzzOne(start: Int, end: Int): Unit {

    for (element in start .. end) {
        if (element % 3 == 0 && element % 5 == 0) {
            println("Fizz Buzz")
        }else if (element % 3 == 0) {
            println("Fizz")
        }else if (element % 5 == 0) {
            println("Buzz")
        }else {
            println(element)
        }
    }
}

fun printlnFizzBuzzTwo(start: Int, end: Int): Unit {
    fun isFizz(element:Int):Boolean = element % 3 == 0

    fun  isBuzz(element:Int):Boolean = element % 5 == 0

    for (element in start .. end) {
        if (isFizz(element) && isBuzz(element)) {
            println("Fizz Buzz")
        }else if (isFizz(element)) {
            println("Fizz")
        } else if (isBuzz(element)) {
            println("Buzz")
        }else {
            println(element)
        }
    }
}

fun printlnFizzBuzzThree(start: Int, end: Int): Unit {
    for (element in start .. end) {
        fun isFizz(element:Int):Boolean = element % 3 == 0
        fun  isBuzz(element:Int):Boolean = element % 5 == 0
        if (isFizz(element) && isBuzz(element)) {
            println("Fizz Buzz")
        }else if (isFizz(element)) {
            println("Fizz")
        } else if (isBuzz(element)) {
            println("Buzz")
        }else {
            println(element)
        }
    }
}

fun printlnFizzBuzzFour(start: Int, end: Int): Unit {
    for (element in start .. end) {
        fun isFizz():Boolean = element % 3 == 0
        fun  isBuzz():Boolean = element % 5 == 0
        if (isFizz() && isBuzz()) {
            println("Fizz Buzz")
        }else if (isFizz()) {
            println("Fizz")
        } else if (isBuzz()) {
            println("Buzz")
        }else {
            println(element)
        }
    }
}

fun printlnFizzBuzzFive(start: Int, end: Int): Unit {
    for (element in start .. end) {
        fun isFizz():Boolean = element % 3 == 0
        fun  isBuzz():Boolean = element % 5 == 0
        when {
            isFizz() && isBuzz() ->  println("Fizz Buzz")
            isFizz() -> println("Fizz")
            isBuzz() ->  println("Buzz")
            else ->  println(element)
        }
    }
}
