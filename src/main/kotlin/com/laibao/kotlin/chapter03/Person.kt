package com.laibao.kotlin.chapter03

/**
 * @author jinge
 * @date 2017-11-03
 * @version 1.0
 */
class Person constructor(val firstName: String, val lastName: String, val age: Int?) {
    init {
        require(firstName.trim().length > 0) {"Invalidate firstName Argument."}
        require(lastName.trim().length > 0) {"Invalidate lastName Argument."}
        if (age != null)
            require(age > 0 && age <= 150) {"Invalidate age Argument."}
    }


    constructor(firstName: String,lastName: String): this(firstName,lastName,null)
}

fun main(args: Array<String>): Unit {
    val person1 = Person("wang","laibao",100)
    val person2 = Person("mao","zedong",20)
    println("${person1.firstName} ${person1.lastName} is ${person1.age} years old")
    println("${person2.firstName} ${person2.lastName} is ${person2.age} years old")

    val person3 = Person("zhou","enlai");
    println("${person3.firstName} ${person3.lastName} is ${person3.age} years old")
    println()
    println()

    val humanBeing = HumanBeing("wang","laibao",100)
    println(humanBeing.getName())
    println(humanBeing.getAge())
}