package com.jptadros.jpsnewsnewyorktimes.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jptadros.jpsnewsnewyorktimes.R
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivityEditProfileBinding
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivityHomeBinding

class EditProfileActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnUpdateProfile.setOnClickListener {
            val updateIntent = Intent(this, HomeActivity::class.java)
            startActivity(updateIntent)
            finish()
    }



}
    }