package com.bca.payment.service

import com.bca.payment.model.Transaction
import com.bca.payment.model.TransactionList
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class PaymentServiceImpl(@Autowired private val restTemplate: RestTemplate): PaymentService {
    val transactionList = TransactionList()

    override fun getPayment(): TransactionList {
        return transactionList
    }

    override fun postPayment(transaction: Transaction): Transaction {
        transactionList.transactions.add(Transaction(transaction.txId, transaction.amount, transaction.status))
        return transaction
    }

}