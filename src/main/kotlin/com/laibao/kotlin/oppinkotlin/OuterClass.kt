package com.laibao.kotlin.oppinkotlin

/**
 * @author laibao wang
 */
open class OuterClass {

    fun sayHello() {
        println("asfdasf")
    }

    class NestedClassOne {
        fun sayHelloInNestedOne() {
            println("sayHelloInNestedOne")
        }
    }

    private class NestedClassTwo {
        fun sayHelloInNestedTwo() {
            println("sayHelloInNestedTwo")
        }
    }

    internal class NestedClassThree {
        fun sayHelloInNestedThree() {
            println("sayHelloInNestedThree")
        }
    }

    class NestedClassFour {
        fun sayHelloInNestedFour() {
            NestedClassTwo().sayHelloInNestedTwo()
        }
    }

    protected class NestedClassFive {
        fun sayHelloInNestedFive() {
            println("sayHelloInNestedFive")
        }
    }

    class NestedClassSix {
        fun sayHelloInNestedSix() {
            NestedClassFive().sayHelloInNestedFive()
        }
    }

}

class A {
    private val somefield: Int = 1

    inner class B {

        private val somefield: Int = 1

        fun foo(s: String) {
            println("Field <somefield> from B" + this.somefield)
            println("Field <somefield> from B" + this@B.somefield)
            println("Field <somefield> from A" + this@A.somefield)
        }
    }

}