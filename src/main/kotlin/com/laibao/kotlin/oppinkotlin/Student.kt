package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */
class Student private constructor(name: String){
    companion object{
        fun create(name: String): Student {
            return Student(name)
        }
    }
}