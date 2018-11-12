package com.laibao.kotlin.oppinkotlin.payment

import java.io.InputStream

/**
 * @author laibao wang
 */
class TextDocument (title:String) : Document (title),IPersistable,IPrintable{

    override fun print() {
        println("Document name:$title")
    }

    override fun save(stream: InputStream) {
        println("Saving to input stream")
    }
}