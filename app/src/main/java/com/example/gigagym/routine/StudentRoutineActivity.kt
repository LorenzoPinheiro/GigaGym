package com.example.gigagym.routine

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.cardview.widget.CardView
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityStudentRoutineBinding
import com.example.gigagym.workout.student.StudentListActivity

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

    override fun onStart() {
        super.onStart()

        findViewById<CardView>(R.id.cardRotina).setOnClickListener { goToWorkout() }
        findViewById<CardView>(R.id.cardRotina2).setOnClickListener { goToWorkout() }
        findViewById<CardView>(R.id.cardRotina3).setOnClickListener { goToWorkout() }
        findViewById<CardView>(R.id.cardRotina4).setOnClickListener { goToWorkout() }
        findViewById<CardView>(R.id.cardRotina5).setOnClickListener { goToWorkout() }
        findViewById<CardView>(R.id.cardRotina6).setOnClickListener { goToWorkout() }
        findViewById<CardView>(R.id.cardRotina7).setOnClickListener { goToWorkout() }
    }

    fun goToWorkout() {
        val i = Intent(this, StudentListActivity::class.java)
        startActivity(i)
    }
}