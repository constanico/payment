package com.bca.payment.service

import com.bca.payment.model.Transaction
import com.bca.payment.model.TransactionList

interface PaymentService {
    fun getPayment(): TransactionList
    fun postPayment(transaction: Transaction)
}