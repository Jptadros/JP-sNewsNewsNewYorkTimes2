package com.jptadros.jpsnewsnewyorktimes.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jptadros.jpsnewsnewyorktimes.R
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {


    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUpUser.setOnClickListener {

            val signUpIntent = Intent(this, HomeActivity::class.java)
            startActivity(signUpIntent)
            finish()
        }



    }
}