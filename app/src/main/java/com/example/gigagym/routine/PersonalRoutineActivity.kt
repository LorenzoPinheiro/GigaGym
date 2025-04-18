package com.example.gigagym.routine

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityPersonalRoutineBinding

class PersonalRoutineActivity : BaseActivity() {

    lateinit var binding: ActivityPersonalRoutineBinding
    override val bottomNavItemId: Int = R.id.nav_routine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_personal_routine)
        binding = ActivityPersonalRoutineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}