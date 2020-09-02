package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Splashscreenactivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreenactivity)
        Log.i("calling", "splashscreen called" )
        handler= Handler()
        handler.postDelayed(
            {
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            },3000)

    }
}