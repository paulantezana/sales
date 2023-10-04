package com.paulantezana.sales.ui.customer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.paulantezana.sales.data.model.CustomerModel
import com.paulantezana.sales.domain.CustomerUseCase
import kotlinx.coroutines.launch

class CustomerViewModel : ViewModel() {
    private val _customers = MutableLiveData<List<CustomerModel>>()
    private val customerUseCase = CustomerUseCase()

    val customers: LiveData<List<CustomerModel>> get() = _customers

    fun fetchCustomers() {
        viewModelScope.launch {
            _customers.value = customerUseCase.getAllCustomer()
        }
    }
}