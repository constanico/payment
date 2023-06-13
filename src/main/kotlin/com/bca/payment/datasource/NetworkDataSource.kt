package com.bca.payment.datasource

import com.bca.payment.model.Transaction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import java.io.IOException

@Repository("network")
class NetworkDataSource(@Autowired private val restTemplate: RestTemplate) : PaymentDataSource {
    override fun retrievePayments(): Collection<Transaction> {
        val response: ResponseEntity<TransactionList> =
                restTemplate.getForEntity("http://localhost:8081/transaction/sale")
        return response.body?.transactions
                ?: throw IOException("Could not fetch data")
    }

}