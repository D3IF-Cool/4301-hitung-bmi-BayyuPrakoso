package org.d3if4045.appnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.btn)
        button.setOnClickListener{
            val t : Float = R.id.tinggi.toFloat() / 100
            val b : Float = R.id.berat.toFloat()
            val res : Float = (b/(t*t))


        }

        val button1 : Button = findViewById(R.id.saran)
        button1.setOnClickListener{
            startActivity(Intent(this, Saran::class.java))
        }
    }
}