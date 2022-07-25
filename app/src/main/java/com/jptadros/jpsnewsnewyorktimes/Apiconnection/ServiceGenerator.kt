package com.jptadros.jpsnewsnewyorktimes.apiconnection

import android.provider.SyncStateContract
import com.jptadros.jpsnewsnewyorktimes.Constants
import com.jptadros.jpsnewsnewyorktimes.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class ServiceGenerator {
        companion object {

            private val retrofit by lazy {
                val logging = HttpLoggingInterceptor()
                logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                val client = OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build()
                Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .client(client)
                    .build()
            }

            val api by lazy {
                retrofit.create(ApiService::class.java)
            }
        }
    }

/*
    private val client = OkHttpClient.Builder().build()


    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()


    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)

    }
}

 */