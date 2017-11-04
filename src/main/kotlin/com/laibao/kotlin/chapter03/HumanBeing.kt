package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
class HumanBeing (firstName: String, lastName: String, age: Int?) {

    private val name: String
    private val age: Int?

    init {
        this.name = "$firstName $lastName"
        this.age = age
    }

    fun getName(): String = this.name

    fun getAge(): Int? = this.age
}