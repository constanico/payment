package com.bca.payment.datasource

import com.bca.payment.model.Transaction

interface PaymentDataSource {
    fun retrievePayments(): Collection<Transaction>
}