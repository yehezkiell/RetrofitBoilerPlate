package com.example.yehezkiel.retrofitboilerplate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.yehezkiel.retrofitboilerplate.Networking.DataRepository
import com.example.yehezkiel.retrofitboilerplate.Pojo.Users
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postService = DataRepository.create()

        postService.getUser("yehezkiell").enqueue(object : Callback<Users>{
            override fun onFailure(call: Call<Users>?, t: Throwable?) {
                Log.e("retrofitnya","gagal ${t}")
            }

            override fun onResponse(call: Call<Users>?, response: Response<Users>?){
                Log.e("retrofitnya",(response?.code().toString()))

                val data = response?.body()
                Log.e("retrofitnya","response body as string = ${data?.id}")


            }

        })

    }
}
