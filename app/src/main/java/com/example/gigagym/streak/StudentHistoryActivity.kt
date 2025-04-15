package com.example.gigagym.streak

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityStudentHistoryBinding

class StudentHistoryActivity : BaseActivity() {
    lateinit var binding: ActivityStudentHistoryBinding
    override val bottomNavItemId: Int = R.id.nav_streak

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_student_history)
        binding = ActivityStudentHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}