package com.laibao.kotlin.chapter03

import java.io.InputStream

/**
 * Created by jinge on 2017/11/4.
 */
interface IPersistable {
    fun save(stream: InputStream)
}