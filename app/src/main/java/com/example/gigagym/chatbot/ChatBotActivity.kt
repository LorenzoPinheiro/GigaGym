package com.example.gigagym.chatbot

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gigagym.BaseActivity
import com.example.gigagym.R
import com.example.gigagym.databinding.ActivityChatBotBinding

class ChatBotActivity : BaseActivity() {

    lateinit var binding: ActivityChatBotBinding
    override val bottomNavItemId: Int = R.id.nav_chat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_chat_bot)
        binding = ActivityChatBotBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }
}