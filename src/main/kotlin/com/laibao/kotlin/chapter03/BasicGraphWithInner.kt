package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
class BasicGraphWithInner(graphName:String) {
    private val name:String

    init {
        name = graphName
    }

    fun draw1():Unit {
        println("Drawing the graph $name")
    }

    inner class InnerLine(val x1:Int,val y1:Int,val x2:Int,val y2:Int) {
        fun draw():Unit {
            println("Drawing a Line from ($x1,$y1) to ($x2,$y2) for graph $name")
        }

        fun drawFromOuter(){
            draw1()
        }
    }
}