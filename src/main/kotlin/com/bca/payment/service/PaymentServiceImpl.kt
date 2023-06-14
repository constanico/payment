package com.bca.payment.service

import com.bca.payment.model.Transaction
import com.bca.payment.model.TransactionList
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class PaymentServiceImpl(@Autowired private val restTemplate: RestTemplate): PaymentService {
    override fun getPayment(): TransactionList {
        val transactionList = TransactionList()
        transactionList.transactions.add(Transaction("TX001",80000,"FAILED"))
        return transactionList
    }

    override fun postPayment(): ResponseEntity<Transaction> {
        return restTemplate.getForEntity("http://localhost:8081/transaction/history", Transaction::class.java)
    }

}