package com.example.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    //@Headers( "accept: application/json\",\n" +
    //   "                        \"content-type: application/json" )
    @GET("kr.cjlogistics")
    fun getInfo(@Query("id")id:String,
                @Query("name")name:String,
                @Query("tel")tel:String) : Call<DataClass>
}