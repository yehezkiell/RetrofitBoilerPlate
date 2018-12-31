package com.example.yehezkiel.retrofitboilerplate.Networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient



/**
 * Created by Yehezkiel on 12/30/2018.
 */
object DataRepository {
    var httpClient = OkHttpClient.Builder()
    fun create(): RetrofitInstance {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build()
        return retrofit.create(RetrofitInstance::class.java)
    }
}