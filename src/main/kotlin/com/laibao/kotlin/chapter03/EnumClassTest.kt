package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */

fun main(args: Array<String>) {
    val day:DayEnum = DayEnum.FRIDAY
    println("the name is ${day.name} and the order is ${day.ordinal}")

    val dayArray:Array<DayEnum> = DayEnum.values()
    dayArray.forEach { day -> println("name is ${day.name} and order is ${day.ordinal}") }

    val planetArray:Array<PlanetEnum> = PlanetEnum.values()
    planetArray.forEach { planet -> println("name is ${planet.mass}, order is ${planet.ordinal} and mass is ${planet.mass} and the radius is ${planet.radius}") }

}