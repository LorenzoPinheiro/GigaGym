package com.example.gigagym.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gigagym.R

class LoginActivity : AppCompatActivity(){

    lateinit var userTypeLabel: TextView
    lateinit var btnEntrar: Button
    lateinit var btnCadastro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnEntrar = findViewById(R.id.buttonEntrar3)
        btnCadastro = findViewById(R.id.buttonCadastro3)
        userTypeLabel = findViewById(R.id.loginUserTypeLabel)
        userTypeLabel.text = intent.getStringExtra("userType")

        Log.d("bruma", "onCreate Inicializado");
    }

    override fun onStart() {
        super.onStart()

        btnEntrar.setOnClickListener{
            var intention = Intent(this, SignInActivity::class.java)
            intention.putExtra("userType", intent.getStringExtra("userType"))
            startActivity(intention)
        }
        btnCadastro.setOnClickListener{
            var intention = Intent(this, SignUpActivity::class.java)
            intention.putExtra("userType", intent.getStringExtra("userType"))
            startActivity(intention)
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