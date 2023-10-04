package com.paulantezana.sales.data.model

import com.google.gson.annotations.SerializedName

data class CustomerModelResponse(
    @SerializedName("success") val success: Boolean,
    @SerializedName("message") val message: String,
    @SerializedName("result") val result: List<CustomerModel>
)
