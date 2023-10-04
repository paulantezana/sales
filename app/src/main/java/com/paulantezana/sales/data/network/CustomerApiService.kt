package com.paulantezana.sales.data.network

import com.paulantezana.sales.data.model.CustomerModelResponse
import retrofit2.Response
import retrofit2.http.GET

interface CustomerApiService {
    @GET("all")
    suspend fun getAll():Response<CustomerModelResponse>
}