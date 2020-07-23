package com.example.dialog

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import java.lang.System.exit
import java.util.*

class MainActivity : AppCompatActivity() {

    private var etFirstName : EditText? = null
    private var etLastName : EditText? = null
    private var etBirthday : EditText? = null
    private var btnSave : Button? = null

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
        setupListeners()
        datePickerDialog()
        alertDialog()
    }
    private fun setupViews() {
        etFirstName = findViewById(R.id.etFirstName)
        etLastName = findViewById(R.id.etLastName)
        etBirthday = findViewById(R.id.etBirthday)
        btnSave = findViewById(R.id.btnSave)
    }
    @RequiresApi(Build.VERSION_CODES.N)
    private fun setupListeners() {
        btnSave?.setOnClickListener {
            alertDialog()
        }
        etBirthday?.setOnClickListener {
            datePickerDialog()
        }
    }
    @RequiresApi(Build.VERSION_CODES.N)
    private fun  datePickerDialog() {
        val dataDialog = DatePickerDialog(this)
        dataDialog.setOnDateSetListener { view, year, month, dayOfMonth ->
            etBirthday?.setText(getString(R.string.date, dayOfMonth, month, year))

        }
        dataDialog.show()
    }

    private fun alertDialog() {
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
