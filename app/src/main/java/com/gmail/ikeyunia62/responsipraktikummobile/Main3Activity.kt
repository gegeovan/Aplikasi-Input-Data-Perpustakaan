package com.gmail.ikeyunia62.responsipraktikummobile

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Main3Activity : Activity() {

    internal lateinit var tnama: TextView
    internal lateinit var tnim: TextView
    internal lateinit var tjurusan: TextView
    internal lateinit var talamat: TextView
    internal var get_nama: String? = null
    internal var get_nim: String? = null
    internal var get_jurusan: String? = null
    internal var get_alamat: String? = null
    internal lateinit var menu: Button
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        menu = findViewById<View>(R.id.kembali) as Button
        tnama = findViewById<View>(R.id.tvnama) as TextView
        tnim = findViewById<View>(R.id.tvnim) as TextView
        tjurusan = findViewById<View>(R.id.tvjurusan) as TextView
        talamat = findViewById<View>(R.id.tvalamat) as TextView

        val b = intent.extras

        get_nama = b!!.getString("parse_nama")
        get_nim = b.getString("parse_nim")
        get_jurusan = b.getString("parse_jurusan")
        get_alamat = b.getString("parse_alamat")

        tnim.text = "Nama : " + get_nama!!
        tnama.text = "Nim : " + get_nim!!
        tjurusan.text = "Jurusan : " + get_jurusan!!
        talamat.text = "Alamat : " + get_alamat!!


    }

    fun onClick(v: View) {
        val intent = Intent(this@Main3Activity, MainActivity::class.java)
        startActivity(intent)

    }
}

