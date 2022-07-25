package com.jptadros.jpsnewsnewyorktimes.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jptadros.jpsnewsnewyorktimes.R
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {

    lateinit var binding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.btnUpdatePassword.setOnClickListener {
           val intent = Intent(this, HomeActivity::class.java)
           startActivity(intent)
           finish()

       }
    }
}