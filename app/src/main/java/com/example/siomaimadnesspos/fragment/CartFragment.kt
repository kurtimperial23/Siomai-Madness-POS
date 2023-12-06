package com.example.siomaimadnesspos.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.siomaimadnesspos.R
import com.example.siomaimadnesspos.adapter.CartAdapter
import com.example.siomaimadnesspos.adapter.PopularAdapter
import com.example.siomaimadnesspos.databinding.FragmentCartBinding
import com.example.siomaimadnesspos.databinding.FragmentHomeBinding

class CartFragment:Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodName = listOf("Buwad","Burger", "Sandwich", "Sili", "Sikwati", "Siomeow" )
        val cartItemPrice = listOf("₱200.00", "₱100.00", "₱300.00", "₱50.00", "₱300.00", "₱50.00")
        val cartImage = listOf(R.drawable.images1,R.drawable.images2,R.drawable.images3,R.drawable.images4,R.drawable.images5,R.drawable.images4,R.drawable.images5)
        val adapter = CartAdapter(ArrayList(cartFoodName), ArrayList(cartItemPrice), ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}
