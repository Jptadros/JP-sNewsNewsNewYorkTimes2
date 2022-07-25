package com.jptadros.jpsnewsnewyorktimes.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jptadros.jpsnewsnewyorktimes.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cvUserImage.setOnClickListener {
            //Change User Image in Browser or Camera

        }
        binding.btnSignOut.setOnClickListener{
            //Delete current login Status and goes back to the login page
            val signOutIntent = Intent(this, LoginActivity::class.java)
            (startActivity(signOutIntent))
            finish()
                 }
        binding.tvAboutUsHome.setOnClickListener{
            //Takes the user to the AboutUs page in a webView
            val aboutUs = Intent(this, AboutUsActivity::class.java)
            (startActivity(aboutUs))

        }


        binding.tvEditProfile.setOnClickListener{
            //Takes the user to the AboutUs page in a webView
            val editProfileIntent = Intent(this, EditProfileActivity::class.java)
            (startActivity(editProfileIntent))
    }
        binding.tvChangePasswordOld.setOnClickListener{
            //Takes the user to the AboutUs page in a webView
            val changePasswordIntent = Intent(this, ChangePasswordActivity::class.java)
            (startActivity(changePasswordIntent))
        }

        binding.btnNews.setOnClickListener{
            //Takes the user to the AboutUs page in a webView
            val newsIntent = Intent(this, NewsActivity::class.java)
            (startActivity(newsIntent))

}}}