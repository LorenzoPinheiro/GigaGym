package com.example.gigagym.workout.personal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityPersonalSeachBinding

class PersonalSeachActivity : BaseActivity() {
    lateinit var binding: ActivityPersonalSeachBinding
    override val bottomNavItemId: Int = R.id.nav_workout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_personal_seach)
        binding = ActivityPersonalSeachBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}