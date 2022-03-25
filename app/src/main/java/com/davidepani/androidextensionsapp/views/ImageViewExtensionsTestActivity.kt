package com.davidepani.androidextensionsapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.davidepani.androidextensionsapp.databinding.ActivityImageViewExtensionsTestBinding


class ImageViewExtensionsTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageViewExtensionsTestBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewExtensionsTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}