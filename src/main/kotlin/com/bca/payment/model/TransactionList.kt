package com.bca.payment.model

import com.bca.payment.model.Transaction

data class TransactionList(
        val transactions: MutableList<Transaction> = mutableListOf()
)