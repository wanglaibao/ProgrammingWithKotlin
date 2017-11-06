package com.laibao.kotlin.chapter03

import java.io.InputStream

/**
 * Created by jinge on 2017/11/4.
 */
class TextDocument(tile:String) : Documet(tile),IPersistable,IPrintable{
    override fun print() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(stream: InputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}