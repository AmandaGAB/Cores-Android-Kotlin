package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var layout: ConstraintLayout
    private lateinit var trgb: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.layout = findViewById(R.id.background)
        this.trgb = findViewById(R.id.Trgb)



        this.layout.setOnClickListener {
            var redR = Random.nextInt(1, 256)
            var blueR = Random.nextInt(1, 256)
            var greenR = Random.nextInt(1, 256)
            layout.setBackgroundColor(Color.rgb(redR,blueR,greenR))
            trgb.text = "Red:"+(redR).toString()+"\nBlue:"+(blueR).toString()+"\nGreen:"+(greenR).toString()
        }


    }
}