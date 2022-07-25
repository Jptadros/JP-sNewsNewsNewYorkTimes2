package com.jptadros.jpsnewsnewyorktimes.JsontoKotlin


import androidx.lifecycle.LiveData
import com.jptadros.jpsnewsnewyorktimes.JsontoKotlin.NewsData

import com.jptadros.jpsnewsnewyorktimes.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {

//@GET("svc/topstories/v2/world.json?api-key=$API_KEY")

@GET("svc/topstories/v2/world.json")
fun getData(@Query("api-key") apikey: String = Constants.API_KEY): Call <NewsData>

}