package com.laibao.kotlin.chapter01

/**
 * Created by jinge on 2017/10/29.
 */

fun main(args: Array<String>): Unit {
    println("my name is jinge")
    println("i am 100 old")
    println("i am still young")

    val javaCocaCola: JavaNutritionFacts  = JavaNutritionFacts.Builder(240,8)
                                                        .calories(100)
                                                        .sodium(35)
                                                        .carbohydrate(27)
                                                        .build();
    println(javaCocaCola.calories)
    println(javaCocaCola.carbohydrate)
    println(javaCocaCola.fat)
    println(javaCocaCola.servingSize)
    println(javaCocaCola.sodium)
    println(javaCocaCola.servings)



    val kotlinCocaCola = KotlinNutritionFacts(240,8,
                                                calories = 100,
                                                sodium = 35,
                                                carbohydrates = 27)

    println(kotlinCocaCola.calories)
    println(kotlinCocaCola.fat)
    println(kotlinCocaCola.servingSize)
    println(kotlinCocaCola.sodium)
    println(kotlinCocaCola.servings)


    val cocaCola = KotlinNutritionFacts(
                                    servingSize = 240,
                                    servings = 8,
                                    calories = 100,
                                    sodium = 35,
                                    carbohydrates = 27)


    println(cocaCola.calories)
    println(cocaCola.fat)
    println(cocaCola.servingSize)
    println(cocaCola.sodium)
    println(cocaCola.servings)
}