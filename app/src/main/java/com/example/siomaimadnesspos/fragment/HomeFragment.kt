package com.example.siomaimadnesspos.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.siomaimadnesspos.R
import com.example.siomaimadnesspos.adapter.PopularAdapter
import com.example.siomaimadnesspos.databinding.FragmentHomeBinding

class HomeFragment:Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.viewAllMenu.setOnClickListener {
            val bottomSheetDialog = MenuBottomSheetFragment()
            bottomSheetDialog.show(parentFragmentManager, "Test")
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val foodname = listOf("Buwad","Burger", "Sandwich", "Sili", "Sikwati", "Siomeow" )
        val price = listOf("₱200.00", "₱100.00", "₱300.00", "₱50.00", "₱300.00", "₱50.00")
        val popularFoodImages = listOf(R.drawable.images1,R.drawable.images2,R.drawable.images3,R.drawable.images4,R.drawable.images5,R.drawable.images4,R.drawable.images5)
        val adapter = PopularAdapter(foodname,price,popularFoodImages)
        binding.popularrecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.popularrecyclerView.adapter = adapter
    }

    companion object {

    }
}