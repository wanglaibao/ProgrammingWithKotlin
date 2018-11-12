package com.laibao.kotlin.oppinkotlin.visibility

import java.util.*

/**
 * @author laibao wang
 */
open class AParent protected constructor(){
    open fun someMethod(): Int = Random().nextInt()
}