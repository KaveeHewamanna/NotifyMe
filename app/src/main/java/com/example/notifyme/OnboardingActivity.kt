package com.example.notifyme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val main = findViewById<Button>(R.id.addbtn)
        main.setOnClickListener(){
            val intent1= Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }

    }
}