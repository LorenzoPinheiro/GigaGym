package com.example.gigagym

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gigagym.chatbot.ChatBotActivity
import com.example.gigagym.profile.ProfileActivity
import com.example.gigagym.routine.PersonalRoutineActivity
import com.example.gigagym.routine.StudentRoutineActivity
import com.example.gigagym.streak.StudentStreakActivity
import com.example.gigagym.workout.student.StudentListActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

abstract class BaseActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    abstract val bottomNavItemId: Int

    protected fun setupBottomNavigation() {
        bottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = bottomNavItemId

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_routine -> {
                    if (this !is StudentRoutineActivity) {
                        navigateToActivity(StudentRoutineActivity::class.java)
                    }
                    true
                }
                R.id.nav_chat -> {
                    if (this !is ChatBotActivity) {
                        navigateToActivity(ChatBotActivity::class.java)
                    }
                    true
                }
                R.id.nav_workout -> {
                    if (this !is StudentListActivity) {
                        navigateToActivity(StudentListActivity::class.java)
                    }
                    true
                }
                R.id.nav_streak -> {
                    if (this !is StudentStreakActivity) {
                        navigateToActivity(StudentStreakActivity::class.java)
                    }
                    true
                }
                R.id.nav_profile -> {
                    if (this !is ProfileActivity) {
                        navigateToActivity(ProfileActivity::class.java)
                    }
                    true
                }
                else -> false
            }
        }
    }

    private fun <T> navigateToActivity(activityClass: Class<T>) {
        val intent = Intent(this, activityClass)

        // Usando ActivityOptions para transições modernas
        val options = ActivityOptions.makeCustomAnimation(
            this,
            android.R.anim.fade_in,
            android.R.anim.fade_out
        )

        startActivity(intent, options.toBundle())
        finish()
    }
}