package com.jptadros.jpsnewsnewyorktimes.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jptadros.jpsnewsnewyorktimes.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
        // initialize DB and go to login page if there are no logged in users
        // go to Home screen if a use is already logged in

        //Using Intent with putExtra the details of the logged in user

    }
}