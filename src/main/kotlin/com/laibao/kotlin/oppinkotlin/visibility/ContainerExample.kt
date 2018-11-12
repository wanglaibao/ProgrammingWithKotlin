package com.laibao.kotlin.oppinkotlin.visibility

import java.lang.reflect.Modifier

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
        val container = DerivedContainer()
        println(container.name)

        println("DerivedContainer.name:${container.name}")

        container.javaClass.superclass.getDeclaredFields().forEach {
                                                   field-> field.setAccessible(true)
                                                    println("Field:${field.name},${Modifier.toString(field.modifiers)} , Value=${field.get(container)}")

        container.javaClass.getDeclaredFields().forEach {
                field->
                field.setAccessible(true)
                println("Field:${field.name},${Modifier.toString(field.modifiers)} , Value=${field.get(container)}")
        }
    }
}
