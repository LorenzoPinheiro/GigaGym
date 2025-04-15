package com.example.gigagym

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityTesteInsano : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste_insano)

        Log.d("bruma", "onCreate Inicializado");
    }
}