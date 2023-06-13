package com.bca.payment.controller

import com.bca.payment.datasource.TransactionList
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/payment/"])
class PaymentController {
    @CrossOrigin
    @GetMapping("/sale")
    fun getPaymentSale(): TransactionList {
        val transactionList = TransactionList()
//        paymentList.payments.add()
        return transactionList
    }

    @CrossOrigin
    @PostMapping("/sale")
    fun postPaymentSale(): TransactionList {
        val transactionList = TransactionList()
        return transactionList
    }
}