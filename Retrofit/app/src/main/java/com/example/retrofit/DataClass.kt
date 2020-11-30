package com.example.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import retrofit2.http.Header
import retrofit2.http.Headers
/*open class DataClass{
    var path: String
    var id: Int*/

    data class PostData(var postbody : PostDataBody)


    data class PostDataBody(
            var id : Int,
            var path : String)



    data class DataClass(var body: DataClassBody)


    data class DataClassBody(

            @SerializedName("id:")
            @Expose
            var id: Int,
            @SerializedName("path:")
            @Expose
            var path : String = "", )

    /*constructor (id: Int,path: String){
        this.id = id
        this.path = path
    }
}*/

