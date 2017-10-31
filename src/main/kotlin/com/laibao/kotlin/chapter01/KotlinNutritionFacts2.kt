package com.laibao.kotlin.chapter01

/**
 * Created by jinge on 2017/10/31.
 */
class KotlinNutritionFacts2 @JvmOverloads constructor(
         val servingSize: Int,
         val servings: Int,
         val calories: Int = 0,
         val fat: Int = 0,
         val sodium: Int = 0,
         val carbohydrates: Int = 0)