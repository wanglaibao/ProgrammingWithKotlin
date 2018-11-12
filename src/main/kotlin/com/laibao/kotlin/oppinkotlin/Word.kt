package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */
enum class Word : Printable{
    HELLO {
        override fun print() {
            println("Word is HELLO")
        }
    },

    BYE{
        override fun print() {
            println("Word is BYE")
        }
    };
}