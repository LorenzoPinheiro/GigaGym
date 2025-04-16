package com.example.gigagym.profile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityEditProfileBinding

class EditProfileActivity : BaseActivity() {
    lateinit var binding: ActivityEditProfileBinding
    override val bottomNavItemId: Int = R.id.nav_profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_edit_profile)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}