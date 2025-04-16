package com.example.gigagym.workout.student

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityStudentWorkoutBinding

class StudentWorkoutActivity : BaseActivity() {
    lateinit var binding: ActivityStudentWorkoutBinding
    override val bottomNavItemId: Int = R.id.nav_workout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_student_workout)
        binding = ActivityStudentWorkoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}