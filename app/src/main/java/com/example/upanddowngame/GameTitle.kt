package com.example.upanddowngame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.upanddowngame.databinding.ActivityGameTitleBinding

class GameTitle : AppCompatActivity() {

    private lateinit var binding: ActivityGameTitleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_title)

        binding = ActivityGameTitleBinding.inflate(layoutInflater)

        val userNick = binding.etNickName.toString() //사용자가 입력한 닉네임
        val startButton = binding.btnGameStart

        startButton.setOnClickListener {
            if(userNick != ""){ //빈칸이 아니라면

            }
        }






        val view = binding.root
        setContentView(view)




    }
}