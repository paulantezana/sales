package com.paulantezana.sales.ui.sale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.paulantezana.sales.R
import com.paulantezana.sales.databinding.FragmentProductBinding
import com.paulantezana.sales.databinding.FragmentSaleBinding

class SaleFragment : Fragment() {
    private var _binding: FragmentSaleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSaleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}