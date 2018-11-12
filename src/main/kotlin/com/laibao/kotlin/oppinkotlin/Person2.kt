package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */
class Person2 (firstName: String, lastName: String, age: Int?){

    private val userName: String

    private val userAge: Int?

    init {
        this.userName = "$firstName$lastName"
        this.userAge = age
    }

    fun getUserName() : String = userName

    fun getUserAge() :  Int? = userAge
}