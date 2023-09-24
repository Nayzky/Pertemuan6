package com.example.pertemuan6

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.Spinner
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jenisKeretaSpinner = findViewById<Spinner>(R.id.jenisKeretaSpinner)
        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        val pesanButton = findViewById<Button>(R.id.pesanButton)

        pesanButton.setOnClickListener {
            val jenisKereta = jenisKeretaSpinner.selectedItem.toString()
            val tanggal = "${datePicker.dayOfMonth}/${datePicker.month + 1}/${datePicker.year}"
            val jam = "${timePicker.hour}:${String.format("%02d", timePicker.minute)}"

            val toastMessage = "Anda telah memesan tiket $jenisKereta pada tanggal $tanggal jam $jam"
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }
    }
}
