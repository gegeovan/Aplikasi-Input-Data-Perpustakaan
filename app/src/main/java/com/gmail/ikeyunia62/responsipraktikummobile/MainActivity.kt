package com.gmail.ikeyunia62.responsipraktikummobile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun data(view: View) {
        val intent = Intent(this@MainActivity, Main2Activity::class.java)
        startActivity(intent)
    }

    fun gambar(view: View) {
        val intent = Intent(this@MainActivity, Main4Activity::class.java)
        startActivity(intent)
    }
}
