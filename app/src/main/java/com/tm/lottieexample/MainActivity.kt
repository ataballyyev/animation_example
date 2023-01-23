package com.tm.lottieexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tm.lottieexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationView.playAnimation()
    }
}