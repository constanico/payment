package com.bca.payment.service

import com.bca.payment.model.Transaction
import com.bca.payment.model.TransactionList
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl(): PaymentService {
    val transactionList = TransactionList()

    override fun getPayment(): TransactionList {
        return transactionList
    }

    override fun postPayment(transaction: Transaction) {
        val status = arrayOf("SUCCESS", "FAILED")
        val randomStatus = status.random()
        transactionList.transactions.add(Transaction(transaction.txId, transaction.amount, randomStatus))
    }
}