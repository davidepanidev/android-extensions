package com.github.davidepanidev.androidextensions.utils.imageloader

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideImageLoader : ImageLoader {

    override fun loadImageFromUrlIntoImageView(
        imageUrl: String,
        imageView: ImageView,
        context: Context
    ) {
        Glide.with(context).apply {
            clear(imageView)
            load(imageUrl)
                .centerCrop()
                .into(imageView)
        }
    }

}