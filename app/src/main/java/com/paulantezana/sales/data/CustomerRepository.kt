package com.paulantezana.sales.data

import com.paulantezana.sales.data.model.CustomerModel
import com.paulantezana.sales.data.network.CustomerService

class CustomerRepository {
    private  val api = CustomerService()

    suspend fun getAll():List<CustomerModel>{
        val customers = api.getAll()
        return if (customers !== null){
            api.getAll()!!.result
        } else {
            emptyList()
        }
    }
}