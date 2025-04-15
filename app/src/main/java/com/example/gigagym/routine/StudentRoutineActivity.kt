package com.example.gigagym.routine

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.gigagym.R

class StudentRoutineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_routine)

        Log.d("bruma", "onCreate Inicializado");
    }
}