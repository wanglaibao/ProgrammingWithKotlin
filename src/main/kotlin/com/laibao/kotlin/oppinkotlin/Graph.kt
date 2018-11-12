package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val line = BasicGraph.Line(1, 0, -2, 0)
    line.draw()

    val line2 = BasicGraphWithInner("InnerLine").InnerLine(1, 0, -2, 0)
    line2.draw()
}


class BasicGraph(val name: String) {
    fun draw(): Unit {
        println("Drawing the graph $name")
    }

    fun draw0(): Unit {
        println("Drawing the graph $name")
    }

    // just as Staic Nested Class in java
    class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2, $y2)")
        }
    }
}

class BasicGraphWithInner(graphName: String){
    private val name: String

    init {
        name = graphName
    }

    fun draw(): Unit {
        println("Drawing the graph $name")
    }

    inner class InnerLine(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {

        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2, $y2) for graph$name ")
            println()
            this@BasicGraphWithInner.draw()
        }
    }
}



