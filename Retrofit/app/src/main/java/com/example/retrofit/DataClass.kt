package com.example.retrofit

import android.widget.Chronometer
import org.jetbrains.annotations.NotNull

/*
open class DataClass {

    var time = MainActivity().timenum

    fun request() : String {
        return "time : ${time}"
    }
*/

   /* var path: String
    var id: Int*/
    //data class PostData(var postbody : PostDataBody)


   // data class PostDataBody(var time: Int, var path: String)



    //data class DataClass(var body: DataClassBody)



    data class DataClass(

            //@SerializedName("id:")
            //@Expose
            var id : Int,
            //@SerializedName("path:")
            //@Expose
            var path : String){
       fun print() {
           val a = DataClass(id, path)
           return println(id)
       }
    }

   /* constructor (id: Int,path: String) {
        this.id = id
        this.path = path
    }*/
//}


