package com.example.gigagym.workout.personal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityPersonalExerciseBinding

class PersonalExerciseActivity : BaseActivity() {
    lateinit var binding: ActivityPersonalExerciseBinding
    override val bottomNavItemId: Int = R.id.nav_workout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_personal_exercise)
        binding = ActivityPersonalExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}