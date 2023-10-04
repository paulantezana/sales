package com.paulantezana.sales.domain

import com.paulantezana.sales.data.CustomerRepository
import com.paulantezana.sales.data.model.CustomerModel

class CustomerUseCase {
    private val repository = CustomerRepository()
    suspend fun getAllCustomer(): List<CustomerModel> = repository.getAll()
}