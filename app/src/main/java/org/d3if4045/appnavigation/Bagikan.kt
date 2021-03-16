package org.d3if4045.appnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bagikan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagikan)

        val button3 : Button = findViewById(R.id.kembali2)
        button3.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}