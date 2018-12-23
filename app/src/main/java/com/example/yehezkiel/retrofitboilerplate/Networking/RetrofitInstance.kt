package com.example.yehezkiel.retrofitboilerplate.Networking

import com.example.yehezkiel.retrofitboilerplate.Pojo.Users
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface RetrofitInstance {

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<List<Users>>

}

object DataRepository {

    fun create(): RetrofitInstance {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://github.com/")
                .build()
        return retrofit.create(RetrofitInstance::class.java)
    }
}