package com.naufal.hitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnHitung.setOnClickListener {
        val tahunLahir = editTahun.text.toString()
        //mengambil data kalender
        val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)

        var umur = 0
        if (tahunLahir.toIntOrNull()==null)
        {

            tvHasil.text = "Input Tahun Belum Diisi!"
        }
        else if (tahunLahir.toInt() > tahunSekarang){
            tvHasil.text = "Input Umur Tidaak Sesuai!"
        }
        else
        {
            umur = tahunSekarang - tahunLahir.toInt()
            tvHasil.text = "Umur = $umur tahun"
        }

    }
    }
}