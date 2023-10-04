package com.paulantezana.sales.data.model

import com.google.gson.annotations.SerializedName

data class CustomerModel(
    @SerializedName("id") val id:Int,
    @SerializedName("full_name") val fullName:String,
    @SerializedName("email") val email:String,
    @SerializedName("phone") val phone:String,
)
