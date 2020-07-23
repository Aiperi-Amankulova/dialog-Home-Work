package com.example.dialog

import android.app.AlertDialog
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.widget.Button
import android.widget.EditText
import java.lang.System.exit
import java.util.*

class MainActivity : AppCompatActivity() {

    private var etFirstName : EditText? = null
    private var etLastName : EditText? = null
    private var etBirthday : EditText? = null
    private var btnSave : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
        setupListeners()
    }



    private fun setupViews() {
        etFirstName = findViewById(R.id.etFirstName)
        etLastName = findViewById(R.id.etLastName)
        etBirthday = findViewById(R.id.etBirthday)
        btnSave = findViewById(R.id.btnSave)
    }
    private fun setupListeners() {
        btnSave?.setOnClickListener {
            createAlertDialog()
        }
    }

    private fun createAlertDialog() {
        AlertDialog.Builder(ContextThemeWrapper(this, R.style.attention ))
            .setTitle(getString(R.string.keep))
            .setPositiveButton(getString(R.string.yes)) { dialog, which ->

            }
            .setNegativeButton(getString(R.string.no)) { dialog, which ->
            }
            .setIcon(R.mipmap.ic_launcher)
            .setCancelable(false)
            .show()
    }


}
