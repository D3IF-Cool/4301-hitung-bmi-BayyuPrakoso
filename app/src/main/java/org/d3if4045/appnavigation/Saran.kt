package org.d3if4045.appnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Saran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saran)

        val button2 : Button = findViewById(R.id.kembali1)
        button2.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}