package com.example.siomaimadnesspos.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.siomaimadnesspos.R
import com.example.siomaimadnesspos.adapter.BuyAgainAdapter
import com.example.siomaimadnesspos.adapter.CartAdapter
import com.example.siomaimadnesspos.databinding.FragmentHistoryBinding
import com.example.siomaimadnesspos.databinding.FragmentHomeBinding

class HistoryFragment:Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        setupRecyclerView()
        return binding.root
    }

    private fun setupRecyclerView(){
        val buyAgainFoodName = arrayListOf("Buwad","Burger", "Sandwich", "Sili", "Sikwati", "Siomeow" )
        val buyAgainFoodPrice = arrayListOf("₱200.00", "₱100.00", "₱300.00", "₱50.00", "₱300.00", "₱50.00")
        val buyAgainFoodImage = arrayListOf(R.drawable.images1,R.drawable.images2,R.drawable.images3,R.drawable.images4,R.drawable.images5,R.drawable.images4,R.drawable.images5)
        buyAgainAdapter = BuyAgainAdapter (buyAgainFoodName, buyAgainFoodPrice, buyAgainFoodImage)
        binding.buyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.buyAgainRecyclerView.adapter = buyAgainAdapter
    }

    companion object {

    }
}
