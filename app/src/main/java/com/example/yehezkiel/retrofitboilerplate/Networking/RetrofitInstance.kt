package com.example.yehezkiel.retrofitboilerplate.Networking

import com.example.yehezkiel.retrofitboilerplate.Pojo.Users
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface RetrofitInstance {

    @GET("users/{username}")
    fun getUser(@Path("username") username:String ): Call<Users>

}
