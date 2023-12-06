package com.example.siomaimadnesspos.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.siomaimadnesspos.R
import com.example.siomaimadnesspos.adapter.CartAdapter
import com.example.siomaimadnesspos.adapter.MenuAdapter
import com.example.siomaimadnesspos.databinding.FragmentHistoryBinding
import com.example.siomaimadnesspos.databinding.FragmentHomeBinding
import com.example.siomaimadnesspos.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment:BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)

        val menuFoodName = listOf("Buwad","Burger", "Sandwich", "Sili", "Sikwati", "Siomeow" )
        val menuItemPrice = listOf("₱200.00", "₱100.00", "₱300.00", "₱50.00", "₱300.00", "₱50.00")
        val menuImage = listOf(R.drawable.images1,R.drawable.images2,R.drawable.images3,R.drawable.images4,R.drawable.images5,R.drawable.images4,R.drawable.images5)
        val adapter = MenuAdapter(ArrayList(menuFoodName), ArrayList(menuItemPrice), ArrayList(menuImage))
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}
