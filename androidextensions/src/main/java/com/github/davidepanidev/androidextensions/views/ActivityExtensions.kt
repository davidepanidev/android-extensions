package com.github.davidepanidev.androidextensions.views

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import timber.log.Timber

fun Activity.openUrlInExternalBrowser(url: String) {
    try {
        startActivity(
            Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
        )
    } catch (e: Exception) {
        Timber.e("openUrlInExternalBrowser EXCEPTION: $e")
        showToast("You may not have an App to open this url.")
    }
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

fun Activity.copyTextToClipboard(textToCopy: String) {
    try {
        (getSystemService(CLIPBOARD_SERVICE) as? ClipboardManager)?.let {
            it.setPrimaryClip(ClipData.newPlainText("", textToCopy))

            // Only show a toast for Android 12 and lower.
            if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.S_V2) {
                showToast(text = "Copied to clipboard.")
            }
        }
    } catch (e: Exception) {
        Timber.e("copyTextToClipboard EXCEPTION: $e")
    }
}

fun Activity.openEmailInExternalApp(toEmailAddresses: Set<String>, subject: String? = null) {
    try {
        startActivity(
            Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, toEmailAddresses.toTypedArray())
                subject?.let {
                    putExtra(Intent.EXTRA_SUBJECT, it)
                }
            }
        )
    } catch (e: Exception) {
        Timber.e("openEmailInExternalApp EXCEPTION: $e")
        showToast("You may not have an App to send emails.")
    }
}

fun Activity.showSnackbar(text: String, length: Int = Snackbar.LENGTH_SHORT) {
    Snackbar.make(
        findViewById(android.R.id.content),
        text,
        length
    ).show()
}

fun Activity.showToast(text: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(
        this,
        text,
        length
    ).show()
}