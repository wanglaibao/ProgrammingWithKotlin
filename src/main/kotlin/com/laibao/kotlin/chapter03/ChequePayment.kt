package com.laibao.kotlin.chapter03

import java.math.BigDecimal


/**
 * Created by jinge on 2017/11/4.
 */
class ChequePayment : Payment{
    val name: String
    val bankId: String
    constructor(amount:BigDecimal,name: String, bankId: String):super(amount){
        this.name = name
        this.bankId = bankId
    }
}