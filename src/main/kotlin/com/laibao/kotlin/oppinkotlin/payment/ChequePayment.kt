package com.laibao.kotlin.oppinkotlin.payment

import java.math.BigDecimal

/**
 * @author laibao wang
 */
class ChequePayment : Payment{

    var name: String
        get() = this.name

    var bankId: String
        get() = this.bankId

    constructor(amount: BigDecimal, name: String, bankId: String):super(amount) {
            this.name = name
            this.bankId = bankId
    }

}