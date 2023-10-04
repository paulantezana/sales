package com.paulantezana.sales.data.network

import com.paulantezana.sales.data.core.RetrofitHelper
import com.paulantezana.sales.data.model.CustomerModelResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class CustomerService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getAll(): CustomerModelResponse ? {
        return withContext(Dispatchers.IO){
            var response: Response<CustomerModelResponse> = retrofit.create(CustomerApiService::class.java).getAll()
            response.body()
        }
    }
}