package com.example.gigagym.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gigagym.R

class MainActivity : AppCompatActivity() {

    lateinit var  btn: Button
    lateinit var btn2: Button
    lateinit var txt: TextView
    var numero = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn = findViewById(R.id.buttonAluno)
        btn2 = findViewById(R.id.buttonPersonal)
        Log.d("bruma", "onCreate Inicializado");
    }

    override fun onStart() {
        super.onStart()

        btn.setOnClickListener{
            var intetion = Intent(this, LoginActivity::class.java)
            intetion.putExtra("userType", "Aluno")
            startActivity(intetion)
        }
        btn2.setOnClickListener{
            var intetion = Intent(this, LoginActivity::class.java)
            intetion.putExtra("userType", "Personal")
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