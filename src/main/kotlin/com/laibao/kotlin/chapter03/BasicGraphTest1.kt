package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */

fun main(args: Array<String>): Unit {
    val graph:BasicGraph = BasicGraph("JinGe")
    graph.draw1()
    val line: BasicGraph.Line = BasicGraph.Line(12, 12, 34, 34)
    line.draw()
}