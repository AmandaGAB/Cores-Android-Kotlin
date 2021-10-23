package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var layout: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.layout = findViewById(R.id.background)




        this.layout.setOnClickListener {

            layout.setBackgroundColor(Color.rgb(Random.nextInt(1, 256),Random.nextInt(1, 256),Random.nextInt(1, 256)))

        }


    }
}