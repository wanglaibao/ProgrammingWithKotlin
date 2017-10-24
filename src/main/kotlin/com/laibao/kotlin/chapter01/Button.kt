package com.laibao.kotlin.chapter01

/**
 * Created by jinge on 2017/10/23.
 */


open class Button : Clickable{
    override fun click() {
        println("I was clicked")
    }
}