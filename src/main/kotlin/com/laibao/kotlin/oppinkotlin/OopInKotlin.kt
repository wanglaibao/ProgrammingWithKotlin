package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val person1 = Person("Alex", "Smith", 29)
    val person2 = Person("Jane", "Smith", 30)
    val person3 = Person("Jaaane", "Smaith", 30)

    val person4 = Person("Jaasdfsfdsfdane", "Smsfdsfsfdaith")

    println("${person1.firstName},${person1.lastName} is ${person1.age} years old")
    println("${person2.firstName},${person2.lastName} is ${person2.age} years old")
    println("${person3.firstName},${person3.lastName} is ${person3.age} years old")

    println("${person4.firstName},${person4.lastName}")


    val person5 = Person2("金", "大侠", 30)
    println("${person5.getUserName()},${person5.getUserAge()}")

}
