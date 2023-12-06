package com.example.siomaimadnesspos

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.siomaimadnesspos.data.User
import com.example.siomaimadnesspos.databinding.ActivityLoginScreenBinding

class LoginScreen : AppCompatActivity() {
    private val binding: ActivityLoginScreenBinding by lazy {
        ActivityLoginScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Sample user data
        val adminUser = User(1, "Kurt Imperial", "kurt@example.com", "1234567890", "admin", "12345","kurt")
        val regularUser = User(2, "John Pataop", "john@example.com", "1234567890", "user", "12345", "john")

        binding.loginButton.setOnClickListener {
            // Retrieve the entered username and password
            val enteredUsername = binding.username.text.toString()
            val enteredPassword = binding.password.text.toString()

            // Check user credentials
            if (validateCredentials(adminUser, enteredUsername, enteredPassword)) {
                val intent = Intent(this, AdminDashboard::class.java)
                startActivity(intent)
            } else if (validateCredentials(regularUser, enteredUsername, enteredPassword)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                // Display a message or handle authentication failure
                showToast("Invalid credentials. Please try again.")
            }
        }

        binding.donthaveaccbutton2.setOnClickListener {
            val intent = Intent(this, CreateAccountScreen::class.java)
            startActivity(intent)
        }
    }

    private fun validateCredentials(user: User, enteredUsername: String, enteredPassword: String): Boolean {
        // Simple authentication check, replace with your actual authentication logic
        return user.username == enteredUsername && user.password == enteredPassword
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
