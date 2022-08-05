package com.github.davidepanidev.androidextensionsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.davidepanidev.androidextensionsapp.databinding.ActivityMainBinding
import com.github.davidepanidev.androidextensionsapp.views.ImageViewExtensionsTestActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        with (binding) {
            btImageViewExtensions.setOnClickListener {
                goToImageViewExtensionsTest()
            }
        }
    }

    private fun goToImageViewExtensionsTest() {
        val intent = Intent(this, ImageViewExtensionsTestActivity::class.java)
        startActivity(intent)
    }

}