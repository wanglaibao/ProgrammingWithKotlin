package com.laibao.kotlin.chapter01

/**
 * Created by jinge on 2017/10/24.
 */

fun getUserName(name:String) : String?  =  if(name == "Jinge") "Jinge" else null


fun main(args: Array<String>) {
    var name = getUserName("Jinge");
    if (name is String) {
        println(name);
    }else{
        println("the name is null")
    }
}