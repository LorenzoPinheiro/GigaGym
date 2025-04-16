package com.example.gigagym.streak

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityPersonalRoutineBinding
import com.example.gigagym.databinding.ActivityPersonalStreakBinding

class PersonalStreakActivity : BaseActivity() {
    lateinit var binding: ActivityPersonalStreakBinding
    override val bottomNavItemId: Int = R.id.nav_streak

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_personal_streak)
        binding = ActivityPersonalStreakBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}