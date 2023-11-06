package com.example.pertemuan_11_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var pahlawanList: ArrayList<PahlawanData>
    private lateinit var pahlawanAdapter: PahlawanAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.layout_RV)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        pahlawanList = ArrayList()

        pahlawanList.add(PahlawanData(R.drawable.ir_soekarno, "Ir. Soekarno"))
        pahlawanList.add(PahlawanData(R.drawable.moh_hatta, "Moh. Hatta"))
        pahlawanList.add(PahlawanData(R.drawable.sukarni_kartodiwirjo, "Sukarni Kartodiwirjo"))
        pahlawanList.add(PahlawanData(R.drawable.achmad_soebardjo, "Achmad Soebardjo"))
        pahlawanList.add(PahlawanData(R.drawable.sayuti_melik, "Sayuti Melik"))
        pahlawanList.add(PahlawanData(R.drawable.agus_salim, "Agus Salim"))
        pahlawanList.add(PahlawanData(R.drawable.ra_kartini, "Raden Ajeng Kartini"))
        pahlawanList.add(PahlawanData(R.drawable.cut_nyak_dien, "Cut Nyak Dien"))
        pahlawanList.add(PahlawanData(R.drawable.pangeran_diponegoro, "Pangeran Diponegoro"))
        pahlawanList.add(PahlawanData(R.drawable.sultan_hasanuddin, "Sultan Hasanuddin"))
        pahlawanList.add(PahlawanData(R.drawable.fatmawati, "Fatmawati"))
        pahlawanList.add(PahlawanData(R.drawable.cipto_mangunkusumo, "Cipto Mangunkusumo"))
        pahlawanList.add(PahlawanData(R.drawable.frans_kaisepo, "Frans Kaisepo"))
        pahlawanList.add(PahlawanData(R.drawable.dr_sutomo, "dr. Sutomo"))
        pahlawanList.add(PahlawanData(R.drawable.dewi_sartika, "Dewi Sartika"))
        pahlawanList.add(PahlawanData(R.drawable.ki_hajar_dewantara, "Ki Hajar Dewantara"))

        pahlawanAdapter = PahlawanAdapter(pahlawanList)
        recyclerView.adapter = pahlawanAdapter

        pahlawanAdapter.onItemClick = {
            Toast.makeText(this@MainActivity, "Anda memilih pahlawan ini", Toast.LENGTH_SHORT).show()
        }
    }
}