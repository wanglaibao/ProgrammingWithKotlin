package com.laibao.kotlin.chapter03

/**
 * Created by jinge on 2017/11/4.
 */
enum class PlanetEnum(val mass:Double, val radius: Double) {
    MERCURY(123.12,13132.132),                                  //水星
    VENUS(345.345,456.456),                                     //金星
    EARTH(213.132,234.342),                                     //地球
    MARS(123.132,342.345),                                      //火星
    JUPITER(134.123,3452.34),                                   //木星
    SATURN(123.123,234.345),                                     //土星
    URANUS(2412.23,243.243),                                    //天王星
    NEPTUNE(123.234,345.2131);                                   //海王星
}