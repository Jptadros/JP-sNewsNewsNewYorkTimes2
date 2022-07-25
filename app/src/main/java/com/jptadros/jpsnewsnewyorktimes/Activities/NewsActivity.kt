package com.jptadros.jpsnewsnewyorktimes.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.jptadros.jpsnewsnewyorktimes.Adapters.NewsAdapter
import com.jptadros.jpsnewsnewyorktimes.Constants
import com.jptadros.jpsnewsnewyorktimes.JsontoKotlin.ApiInterface
import com.jptadros.jpsnewsnewyorktimes.JsontoKotlin.NewsData
import com.jptadros.jpsnewsnewyorktimes.R
import kotlinx.android.synthetic.main.activity_news.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsActivity : AppCompatActivity() {
    private val url = Constants.BASE_URL
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        getMyData()
    }


    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(url)
            .build()
            .create(ApiInterface::class.java)
        // Toast.makeText(activity, "$retrofitBuilder", Toast.LENGTH_SHORT).show()

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<NewsData> {
            override fun onResponse(call: Call<NewsData>, response: Response<NewsData>) {
                val responseBody = response.body()?.results!!

                val recyclerview = rv_news
                recyclerview.layoutManager = LinearLayoutManager(this@NewsActivity)
                val adapter = NewsAdapter(responseBody)

                // Toast.makeText(activity, "$responseBody", Toast.LENGTH_SHORT).show()
                recyclerview.adapter = adapter

                Log.e("ResponseBody", "${response.body()}")
                //   newsText.text = responseBody.get(1).title.toString()

            }

            override fun onFailure(call: Call<NewsData>, t: Throwable) {
                Log.e("Failed", t.message.toString())
            }
        }
        )
    }

}