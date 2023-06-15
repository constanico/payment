package com.bca.payment.controller

import com.bca.payment.model.Transaction
import com.bca.payment.model.TransactionList
import com.bca.payment.service.PaymentService
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/payment/"])
class PaymentController(private val paymentService: PaymentService) {

    @Autowired
    lateinit var objectMapper: ObjectMapper

    @CrossOrigin
    @GetMapping("/sale")
    fun getPaymentSale(): TransactionList {
        return paymentService.getPayment()
    }

    @CrossOrigin
    @PostMapping("/sale")
    fun postPaymentSale(@RequestBody req: String) {
        val request: Transaction = objectMapper.readValue(req)
        paymentService.postPayment(request)
    }
}