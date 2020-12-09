package com.example.retrofit

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {


    @GET("de.dhl")
    @Headers( "content-type: application/json")
    fun getInfo(
            @Query("id") id : Int,
            @Query("path")path  : String,
    ) : Call<ArrayList<DataClass>>

    /* @FormUrlEncoded
     @POST("")
     fun PostInfo(@Body dataBody: PostDataBody) :Call<PostData>*/
}