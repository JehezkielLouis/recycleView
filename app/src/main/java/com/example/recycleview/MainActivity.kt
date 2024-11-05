package com.example.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var _nama : Array<String>
    private lateinit var _karakter : Array<String>
    private lateinit var _deskripsi : Array<String>
    private lateinit var _gambar : Array<String>

    private var arwayang = arrayListOf<wayang>()

    private lateinit var _rvWayang : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        _rvWayang = findViewById<RecyclerView>(R.id.rvWayang)

        fun SiapkanData(){
            _nama = resources.getStringArray(R.array.namaWayang)
            _deskripsi = resources.getStringArray(R.array.deskripsiWayang)
            _karakter = resources.getStringArray(R.array.karakterUtamaWayang)
            _gambar = resources.getStringArray(R.array.gambarWayang)

        }
    }
}