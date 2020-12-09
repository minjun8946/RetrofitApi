package com.example.retrofit

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.jetbrains.annotations.NotNull
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var gson: Gson = GsonBuilder()
                .setLenient()
                .create()

        val regionRetrofit = Retrofit.Builder()
            .baseUrl("http://3.137.223.127:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var server: RetrofitService? = regionRetrofit.create(RetrofitService::class.java)


        server?.getInfo(1,"json")?.enqueue(object : Callback<ArrayList<DataClass>> {
            override fun onFailure(callback: Call<ArrayList<DataClass>>, t: Throwable) {
                t.printStackTrace()
            }

            override fun onResponse(call: Call<ArrayList<DataClass>>, response: Response<ArrayList<DataClass>>) {
                println("wow")
                val id = 1
                val name = response.body()?.toString()
                val test: TextView = findViewById(R.id.test)
               test.setText(name.toString())
                println(response.raw())
                 val d = DataClass(id = 1,path = "d")
                d.print()
            }
        })

    }
}
