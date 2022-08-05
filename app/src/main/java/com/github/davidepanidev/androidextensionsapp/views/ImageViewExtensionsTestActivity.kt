package com.github.davidepanidev.androidextensionsapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.davidepanidev.androidextensions.utils.imageloader.GlideImageLoader
import com.github.davidepanidev.androidextensions.views.loadImageFromUrl
import com.github.davidepanidev.androidextensionsapp.databinding.ActivityImageViewExtensionsTestBinding


class ImageViewExtensionsTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageViewExtensionsTestBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewExtensionsTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        with (binding) {
            btLoadImageFromUrl.setOnClickListener {
                testLoadImageFromUrl()
            }
        }
    }

    private fun testLoadImageFromUrl() {
        binding.ivTest.loadImageFromUrl(
            url = "https://bitcoin.org/img/icons/opengraph.png?1644775669",
            imageLoader = GlideImageLoader()
        )
    }

}