package com.laibao.kotlin.chapter01

/**
 * Created by jinge on 2017/10/23.
 */



abstract class Animated {
    abstract fun animate()
    open fun stopAnimating(){
        println("should be overriden")
    }
    fun animateTwice() {
        println("should not be overriden")
    }
}