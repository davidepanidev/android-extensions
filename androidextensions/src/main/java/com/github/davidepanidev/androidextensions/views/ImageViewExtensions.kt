package com.github.davidepanidev.androidextensions.views

import android.widget.ImageView
import com.github.davidepanidev.androidextensions.utils.imageloader.ImageLoader


fun ImageView.loadImageFromUrl(url: String, imageLoader: ImageLoader) {
    imageLoader.loadImageFromUrlIntoImageView(
        imageUrl = url,
        imageView = this,
        context = this.context
    )
}