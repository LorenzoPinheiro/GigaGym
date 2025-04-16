package com.example.gigagym.streak

import android.os.Bundle
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityStudentStreakBinding

class StudentStreakActivity : BaseActivity() {
    lateinit var binding: ActivityStudentStreakBinding
    override val bottomNavItemId: Int = R.id.nav_streak

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_student_streak)
        binding = ActivityStudentStreakBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}