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

        postService.getUser("yehezkiell").enqueue(object : Callback<List<Users>>{
            override fun onFailure(call: Call<List<Users>>?, t: Throwable?) {
                Log.e("retrofitnya","gagal")
            }

            override fun onResponse(call: Call<List<Users>>?, response: Response<List<Users>>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.e("retrofitnya","berhasil")

                val data = response?.body()

                data?.map {
                    Log.d("tag", "datanya ${it.followers}")
                }

            }

        })

    }
}
