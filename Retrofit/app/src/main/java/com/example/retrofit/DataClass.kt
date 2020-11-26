package com.example.retrofit

import com.google.gson.annotations.SerializedName
import retrofit2.http.Header
import retrofit2.http.Headers

data class DataClass(var body: DataClassBody)


data class DataClassBody(
    @SerializedName("id") var id: Long,
    @SerializedName("name") var name : Long,
    @SerializedName("tel") var tel : Int)
