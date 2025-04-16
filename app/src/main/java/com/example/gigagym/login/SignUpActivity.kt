package com.example.gigagym.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gigagym.R
import com.example.gigagym.routine.StudentRoutineActivity

class SignUpActivity : AppCompatActivity() {

    lateinit var btnCadastro: Button
    lateinit var userTypeLabel: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnCadastro = findViewById(R.id.buttonCadastrar3)
        userTypeLabel = findViewById(R.id.signUpUserLabel)
        userTypeLabel.text = intent.getStringExtra("userType")
        Log.d("bruma", "onCreate Inicializado");

    }

    override fun onStart() {
        super.onStart()
        btnCadastro.setOnClickListener{
            if (userTypeLabel.text.toString() == "Aluno") {
                var intetion = Intent(this, UserDataActivity::class.java)
                startActivity(intetion)
            } else {
                // go to app
            }
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