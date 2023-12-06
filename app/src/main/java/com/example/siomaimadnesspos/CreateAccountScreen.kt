package com.example.siomaimadnesspos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.siomaimadnesspos.databinding.ActivityCreateAccountScreenBinding

class CreateAccountScreen : AppCompatActivity() {
    private val binding: ActivityCreateAccountScreenBinding by lazy {
        ActivityCreateAccountScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.haveaccbutton.setOnClickListener {
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }

        binding.haveaccbutton.setOnClickListener {
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }
    }
}