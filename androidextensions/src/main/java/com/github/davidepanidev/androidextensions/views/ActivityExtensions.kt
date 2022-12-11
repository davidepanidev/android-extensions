package com.github.davidepanidev.androidextensions.views

import android.app.Activity
import android.content.Intent
import android.net.Uri

fun Activity.openUrlInExternalBrowser(url: String) {
    val uri = Uri.parse(url)

    startActivity(
        Intent(Intent.ACTION_VIEW).apply {
            data = uri
        }
    )
}

fun Activity.openAppInPlayStore(packageName: String) {
    val playStoreAppUrl = "https://play.google.com/store/apps/details?id=$packageName"
    val playStoreAppUri = Uri.parse(playStoreAppUrl)

    try {
        startActivity(
            Intent(Intent.ACTION_VIEW).apply {
                data = playStoreAppUri
                setPackage("com.android.vending")
            }
        )
    } catch (e: Exception) {
        openUrlInExternalBrowser(url = playStoreAppUrl)
    }
}