package com.tbeszteri.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AddNewChimpActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addnewchimp)
        val chkGorilla: CheckBox = findViewById(R.id.chkAreUGorilla)
        val btnAdd: Button = findViewById(R.id.btnOk)
        val edtChimpName: EditText = findViewById(R.id.editTextTextChimpName)
        val edtChimpBalance: EditText = findViewById(R.id.editTextBalance)
    }


}