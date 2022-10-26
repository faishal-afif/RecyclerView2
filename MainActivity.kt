package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stringNama: String = "Nama\t\t: "
        val stringNim: String = "NIM\t\t\t: "
        val stringHobi: String = "Hobi\t\t\t: "
        val memberList = listOf<Member>(
            Member(R.drawable.instagram,
                "$stringNama Ana Balqis Sholehah",
                "$stringNim 205150200111063",
                "$stringHobi Ini Hobi Ana"
            ),
            Member(R.drawable.foto_afif,
                "$stringNama Faishal Afif",
                "$stringNim 205150201111041",
                "$stringHobi Ini hobi Afif"
            ),
            Member(R.drawable.foto_ika,
                "$stringNama Ika Febrianti",
                "$stringNim 205150200111060",
                "$stringHobi Ini hobi Ika"
            )
        // Nambah List secara manual
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_member)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MemberAdapter(this, memberList) {

        }

    }
}
