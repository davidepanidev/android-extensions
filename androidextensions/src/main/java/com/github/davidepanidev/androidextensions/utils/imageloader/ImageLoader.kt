package com.github.davidepanidev.androidextensions.utils.imageloader

import android.content.Context
import android.widget.ImageView

interface ImageLoader {

    fun loadImageFromUrlIntoImageView(imageUrl: String, imageView: ImageView, context: Context)

}