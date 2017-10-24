package com.laibao.kotlin.chapter01

/**
 * Created by jinge on 2017/10/23.
 */

class MyAnimated : Animated(){
    override fun animate() {
        println("to do something here")
    }
    override fun stopAnimating() {
        super.stopAnimating()
    }
}