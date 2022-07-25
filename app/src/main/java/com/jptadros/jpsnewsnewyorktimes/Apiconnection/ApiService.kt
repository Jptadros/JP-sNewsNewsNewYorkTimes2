package com.jptadros.jpsnewsnewyorktimes.apiconnection


import com.jptadros.jpsnewsnewyorktimes.JsontoKotlin.NewsData
import com.jptadros.jpsnewsnewyorktimes.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("svc/topstories/v2/world.json")
    fun getNews(@Query("api-key") apikey: String = Constants.API_KEY): Call<NewsModel>
}