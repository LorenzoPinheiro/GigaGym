package com.example.gigagym.routine

import android.os.Bundle
import android.util.Log
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityStudentRoutineBinding

class StudentRoutineActivity : BaseActivity() {

    lateinit var binding: ActivityStudentRoutineBinding
    override val bottomNavItemId: Int = R.id.nav_routine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_student_routine)
        binding = ActivityStudentRoutineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()

        Log.d("tag", "onCreate Inicializado");
    }
}