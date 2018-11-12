package com.laibao.kotlin.oppinkotlin.payment

import org.joda.time.DateTime
import java.math.BigDecimal

/**
 * @author laibao wang
 */
class CardPayment (amount: BigDecimal,
                   val number: String,
                   val expiryDate: DateTime,
                   val type: CardType) : Payment (amount){
}