package com.laibao.kotlin.chapter01

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun sum2(a: Int, b: Int) = a + b



val age:Int = 100

val name:String = "金戈"

val number = 123.01

val address = "杭州"

var country:String = "美国"



// simple name in template:
var a = 1
val s1 = "a is $a"

// arbitrary expression in template:
val b = 2
val s2 = "${s1.replace("is", "was")}, but now is $b"

//fun main(args: Array<String>) {
//    val name = if (args.size > 0) args[0] else "Kotlin"
//    println("Hello, $name!")
//}

fun printArgs(str:String,strs:Array<String>) {
    println("str=$str, first = ${strs[0]}")
}

fun main(args: Array<String>){
    var byte: Byte = 127                                // Signed byte, -128 to 127
    var char: Char = 'A'                                // A 16bit Unicode character
    var short: Short = Short.MAX_VALUE                  //16bit signed MAX_VALUE == 32767
    var int: Int = 0xff                                 // 32bit signed, Hex can be used with 0x prefix
    var long:Long = 0b11101101                          // 64bit signed, binary can be used with 0b prefix
    var float:Float = 3.14f                             // 32bit floating point number, floats designated with f postfix
    var double:Double = 3.1e10                          // 64bit floating point, IEEE notation can be used too

    //double = float;                                   // automatic down conversation is not allowed
    //float = double;                                   // Nor is up conversion!

    double = float.toDouble()                           //Explicit conversion is allowed
    float = double.toFloat()

    byte = short.toByte()                               // allowed, but value too big so value is -1
    short = 42;
    byte = short.toByte()                               // value fits, new val would be 42
}