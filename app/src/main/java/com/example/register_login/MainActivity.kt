package com.example.register_login

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.register_login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding
    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: dipanggil")

        with(binding) {
            btnLogin.setOnClickListener {
                val intent =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra(EXTRA_USERNAME, username.text.toString())
                intent.putExtra(EXTRA_EMAIL , email.text.toString())
                intent.putExtra(EXTRA_PHONE , phone.text.toString())
                intent.putExtra(EXTRA_PASSWORD, password.text.toString())
                startActivity(intent)
            }

            lgn.setOnClickListener{
                val intent = Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(intent)
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "OnStart: dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume: dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause: dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop: dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy: dipanggil")
    }
}
