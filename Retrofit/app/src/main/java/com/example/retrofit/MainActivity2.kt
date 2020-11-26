package com.example.retrofit

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
        val regionRetrofit = Retrofit.Builder()
            .baseUrl("https://apis.tracker.delivery/carriers/")
            .addConverterFactory(GsonConverterFactory.create())

            .build()
        var regionServer: RetrofitService? = regionRetrofit.create(RetrofitService::class.java)


        regionServer?.getInfo("json", "", "")?.enqueue(object : Callback<DataClass> {
            override fun onFailure(call: Call<DataClass>, t: Throwable) {
                t.printStackTrace()
                println("fail")
            }

            override fun onResponse(call: Call<DataClass>, response: Response<DataClass>) {
                println("wow")
                val appld = response?.body()?.body?.id // 이거는 내가 가져올 data class 에 있는 것들
                val test: TextView = findViewById(R.id.test)
                test.setText(appld.toString())
                println(response.raw())
            }
        })
    }
}