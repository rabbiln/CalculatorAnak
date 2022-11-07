package com.blvpvi.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Mengambil ID EditText
        val angka1 = findViewById<EditText>(R.id.angka1)
        val angka2 = findViewById<EditText>(R.id.angka2)
        val hasil = findViewById<TextView>(R.id.hasil)

        val btnTambah = findViewById<Button>(R.id.btn_tambah)
        val btnKurang = findViewById<Button>(R.id.btn_kurang)
        val btnKali = findViewById<Button>(R.id.btn_kali)
        val btnBagi = findViewById<Button>(R.id.btn_bagi)

        btnTambah.setOnClickListener {
            if (angka1.text.toString().trim() == "" || angka2.text.toString().trim() == "") {
                Toast.makeText(
                    applicationContext,
                    "Angka 1 dan Angka 2 Tidak Boleh Kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

               hasil.text = (angka1.text.toString().toDouble() + angka2.text.toString().toDouble()).toString()
            }
        }
        btnKurang.setOnClickListener {
            if (angka1.text.toString().trim() == "" || angka2.text.toString().trim() == "") {
                Toast.makeText(
                    applicationContext,
                    "Angka 1 dan Angka 2 Tidak Boleh Kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                hasil.text = (angka1.text.toString().toDouble()-angka2.text.toString().toDouble()).toString()
            }
        }
        btnKali.setOnClickListener {
            if (angka1.text.toString().trim() == "" || angka2.text.toString().trim() == "") {
                Toast.makeText(
                    applicationContext,
                    "Angka 1 dan Angka 2 Tidak Boleh Kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                hasil.text = (angka1.text.toString().toDouble()*angka2.text.toString().toDouble()).toString()
            }
        }
        btnBagi.setOnClickListener {
            if (angka1.text.toString().trim() == "" || angka2.text.toString().trim() == "") {
                Toast.makeText(
                    applicationContext,
                    "Angka 1 dan Angka 2 Tidak Boleh Kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                hasil.text = (angka1.text.toString().toDouble() / angka2.text.toString().toDouble()).toString()
            }
        }

    }
}