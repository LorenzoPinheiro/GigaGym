package com.example.gigagym.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gigagym.R

class VerifyEmailActivity : AppCompatActivity() {

    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_email)

        btn = findViewById(R.id.buttonConferir)
        Log.d("bruma", "onCreate Inicializado");
    }

    override fun onStart() {
        super.onStart()

        btn.setOnClickListener{
            var intetion = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intetion)
        }
        Log.d("bruma", "onStart Inicializado");
    }

    override fun onResume() {
        super.onResume()
        Log.d("bruma", "onResume Inicializado");
    }

    override fun onPause() {
        super.onPause()
        Log.d("bruma", "onPause Inicializado");
    }

    override fun onStop() {
        super.onStop()
        Log.d("bruma", "onStop Inicializado");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("bruma", "onRestart Inicializado");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("bruma", "onDestroy Inicializado");
    }
}