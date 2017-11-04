package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
enum class WordEnum : Printable{
    HELLO {
        override fun print() {
            println("the word is HELLO")
        }
    },
    BYE {
        override fun print() {
            println("the word is BYE")
        }
    }
}