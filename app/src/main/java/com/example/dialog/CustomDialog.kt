package com.example.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CustomDialog(
    context: Context,
    private val listener: MainActivity
    ) : Dialog(context) {

        private var tvSuccess: TextView? = null
        private var tvText: TextView?= null
        private var btnDone: Button? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.custom_dialog)
            setCancelable(false)
            setupViews()
            setupListeners()
        }
        private fun setupViews() {
            tvSuccess = findViewById(R.id.tvSuccess)
            tvText = findViewById(R.id.tvText)
            btnDone = findViewById(R.id.btnDone)
    }

        private fun setupListeners() {
            btnDone?.setOnClickListener {
                dismiss()
            }
        }


    }
