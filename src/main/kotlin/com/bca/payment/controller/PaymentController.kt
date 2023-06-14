package com.bca.payment.controller

import com.bca.payment.model.Transaction
import com.bca.payment.model.TransactionList
import com.bca.payment.service.PaymentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/payment/"])
class PaymentController(private val paymentService: PaymentService) {
    @CrossOrigin
    @GetMapping("/sale")
    fun getPaymentSale(transactionList: TransactionList): TransactionList {
        return paymentService.getPayment()
    }

    @CrossOrigin
    @PostMapping("/sale")
    fun postPaymentSale(transaction: Transaction): ResponseEntity<Transaction> {
        return paymentService.postPayment()
    }
}