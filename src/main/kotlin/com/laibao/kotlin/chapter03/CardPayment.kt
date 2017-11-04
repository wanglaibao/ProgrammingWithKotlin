package com.laibao.kotlin.chapter03

import org.joda.time.DateTime
import java.math.BigDecimal

/**
 * Created by jinge on 2017/11/4.
 */
class CardPayment(amount: BigDecimal, val number: String, val expiryDate: DateTime, val type: CardType):Payment(amount)