package com.bca.payment.datasource

import com.bca.payment.model.Transaction

data class TransactionList(
        val transactions: MutableList<Transaction> = mutableListOf()
)