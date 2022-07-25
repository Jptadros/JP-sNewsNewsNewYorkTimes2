package com.jptadros.jpsnewsnewyorktimes

import android.annotation.SuppressLint
import android.view.View

@SuppressLint("StaticFieldLeak")
object Constants {

    lateinit var viewSignup:View

    const val BASE_URL = "https://api.nytimes.com/"
    const val API_KEY = "SNGOPfEuVSx2yVqbCEjQxS00JyAkQK9S"
    const val PARAM_URL = "svc/topstories/v2/world.json?api-key="
    const val PARAM_API_URL = "svc/topstories/v2/world.json?api-key=SNGOPfEuVSx2yVqbCEjQxS00JyAkQK9S"
}