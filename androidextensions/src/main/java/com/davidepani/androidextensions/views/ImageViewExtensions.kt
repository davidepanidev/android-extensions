package com.davidepani.androidextensions.views

import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.loadImageFromUrl(url: String) {
    Glide.with(this.context).apply {
        clear(this@loadImageFromUrl)
        load(url)
            .centerCrop()
            .into(this@loadImageFromUrl)
    }
}