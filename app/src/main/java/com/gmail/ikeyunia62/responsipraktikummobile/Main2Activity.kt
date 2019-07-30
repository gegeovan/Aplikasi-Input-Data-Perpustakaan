package com.gmail.ikeyunia62.responsipraktikummobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.view.View.OnClickListener

class Main2Activity : AppCompatActivity() {
    internal lateinit var fieldnama: EditText
    internal lateinit var fieldnim: EditText
    internal lateinit var fieldjurusan: EditText
    internal lateinit var fieldalamat: EditText
    internal lateinit var tombolok: Button
    internal lateinit var var_nama: String
    internal lateinit var var_nim: String
    internal var var_jurusan: String? = null
    internal var var_alamat: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        fieldnama = findViewById<View>(R.id.nama) as EditText
        fieldnim = findViewById<View>(R.id.nim) as EditText
        fieldjurusan = findViewById<View>(R.id.jurusan) as EditText
        fieldalamat = findViewById<View>(R.id.alamat) as EditText
        tombolok = findViewById<View>(R.id.ok) as Button
        val tombolok = findViewById<View>(R.id.ok) as Button
        tombolok.setOnClickListener {
            // TODO Auto-generated method stub
            var_nama = fieldnama.text.toString()
            var_nim = fieldnim.text.toString()
            var i: Intent? = null
            i = Intent(this@Main2Activity, Main3Activity::class.java)

            val b = Bundle()

            b.putString("parse_nama", var_nama)
            b.putString("parse_nim", var_nim)
            b.putString("parse_jurusan", var_jurusan)
            b.putString("parse_alamat", var_alamat)
            i.putExtras(b)

            startActivity(i)
        }
    }


}

