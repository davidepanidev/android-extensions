package com.github.davidepanidev.androidextensionsapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.davidepanidev.androidextensions.views.copyTextToClipboard
import com.github.davidepanidev.androidextensions.views.openEmailInExternalApp
import com.github.davidepanidev.androidextensionsapp.databinding.ActivityActivityExtensionsTestBinding


class ActivityExtensionsTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActivityExtensionsTestBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivityExtensionsTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        with (binding) {
            btCopyToClipboard.setOnClickListener {
                copyTextToClipboard(textToCopy = "Text copied to clipboard.")
            }

            btSendEmail.setOnClickListener {
                openEmailInExternalApp(
                    toEmailAddresses = setOf(
                        "email@email.com",
                        "email2@email.com"
                    ),
                    subject = "Test"
                )
            }
        }
    }

}