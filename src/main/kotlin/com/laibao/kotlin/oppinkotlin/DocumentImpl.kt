package com.laibao.kotlin.oppinkotlin

import java.io.InputStream
import java.io.OutputStream

/**
 * @author laibao wang
 */
class DocumentImpl : Document{
    override val version: Long
        get() = 0

    override val size: Long
        get() = 0

    override fun save(input: InputStream) {

    }

    override fun load(stream: OutputStream) {

    }
}