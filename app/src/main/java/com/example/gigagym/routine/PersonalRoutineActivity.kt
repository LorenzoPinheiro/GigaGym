package com.example.gigagym.routine

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityPersonalRoutineBinding
import com.example.gigagym.workout.personal.PersonalListActivity
import com.google.android.material.chip.Chip

class PersonalRoutineActivity : BaseActivity() {

    lateinit var binding: ActivityPersonalRoutineBinding
    override val bottomNavItemId: Int = R.id.nav_routine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_personal_routine)
        binding = ActivityPersonalRoutineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
        findViewById<Chip>(R.id.chip4).isChecked = true
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
        val i = Intent(this, PersonalListActivity::class.java)
        startActivity(i)
    }
}