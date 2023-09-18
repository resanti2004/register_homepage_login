package com.example.register_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.register_login.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private val TAG = "ThirdctivityLifecycle"
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: dipanggil")

        with(binding) {
            rgs.setOnClickListener{
                val intent = Intent(this@ThirdActivity, MainActivity::class.java)
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