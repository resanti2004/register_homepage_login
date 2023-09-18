package com.example.register_login

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.register_login.MainActivity.Companion.EXTRA_USERNAME
import com.example.register_login.databinding.ActivitySecondBinding

private lateinit var binding: ActivitySecondBinding
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        val welcomeMessage = "Welcome $username"
        val emails = "Your $email has been activated"
        val telp = "Your $phone has been registered"
        with(binding) {
            txtUsername.text = welcomeMessage
            txtEmail.text = emails
            txtPhone.text = telp
        }
    }
}
