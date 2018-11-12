package com.laibao.kotlin.oppinkotlin.payment

import java.io.InputStream

/**
 * @author laibao wang
 */
interface IPersistable {
    fun save(stream: InputStream)
}