package com.bca.payment.service

import com.bca.payment.model.Transaction
import com.bca.payment.model.TransactionList
import org.springframework.http.ResponseEntity

interface PaymentService {
    fun getPayment(): TransactionList
    fun postPayment(transaction: Transaction): Transaction
}