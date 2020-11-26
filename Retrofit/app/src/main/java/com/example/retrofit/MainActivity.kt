package com.example.retrofit


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import java.util.*
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
//import okhttp3.MediaType.Companion.toMediaTypeOrNull
import retrofit2.Retrofit
fun rand(): List<Int> {
    val arr = arrayListOf<Int>()
    val random=  Random()
    for(i in 1..1000){
        val num = random.nextInt(30)
        arr.add(num+1)
    }
    val arr2 = arr.distinct()
    return arr2
}




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val timer1 : Chronometer = findViewById(R.id.timer1)
        val n1 : Button  = findViewById(R.id.n1)
        val n2 : Button  = findViewById(R.id.n2)
        val n3 : Button  = findViewById(R.id.n3)
        val n4 : Button  = findViewById(R.id.n4)
        val n5 : Button  = findViewById(R.id.n5)
        val n6 : Button  = findViewById(R.id.n6)
        val n7 : Button  = findViewById(R.id.n7)
        val n8 : Button  = findViewById(R.id.n8)
        val n9 : Button  = findViewById(R.id.n9)
        val n10 : Button  = findViewById(R.id.n10)
        val n11 : Button  = findViewById(R.id.n11)
        val n12 : Button  = findViewById(R.id.n12)
        val n13 : Button  = findViewById(R.id.n13)
        val n14 : Button  = findViewById(R.id.n14)
        val n15 : Button  = findViewById(R.id.n15)
        val n16 : Button  = findViewById(R.id.n16)
        val n17 : Button  = findViewById(R.id.n17)
        val n18 : Button  = findViewById(R.id.n18)
        val n19 : Button  = findViewById(R.id.n19)
        val n20 : Button  = findViewById(R.id.n20)
        val n21 : Button  = findViewById(R.id.n21)
        val n22 : Button  = findViewById(R.id.n22)
        val n23 : Button  = findViewById(R.id.n23)
        val n24 : Button  = findViewById(R.id.n24)
        val n25 : Button  = findViewById(R.id.n25)
        val n26 : Button  = findViewById(R.id.n26)
        val n27 : Button  = findViewById(R.id.n27)
        val n28 : Button  = findViewById(R.id.n28)
        val n29 : Button  = findViewById(R.id.n29)
        val n30 : Button  = findViewById(R.id.n30)

        val arr = rand() // rand 함수로 arr 를 rand 함
        println(arr)

        val change = arr.sorted() // arr를 낮은 순서대로 배열
        println(change)

        var count =0 // 누른 횟수 배열만들때 사용
        var chilk = 0 // 이것도 누른 횟수

        val start : Button = findViewById(R.id.start)
        timer1.stop()
        start.setOnClickListener{
            timer1.base = SystemClock.elapsedRealtime()
            timer1.start()
            count=0
            chilk=0
            n1.setText(arr[0].toString())
            n2.setText(arr[1].toString())
            n3.setText(arr[2].toString())
            n4.setText(arr[3].toString())
            n5.setText(arr[4].toString())
            n6.setText(arr[5].toString())
            n7.setText(arr[6].toString())
            n8.setText(arr[7].toString())
            n9.setText(arr[8].toString())
            n10.setText(arr[9].toString())
            n11.setText(arr[10].toString())
            n12.setText(arr[11].toString())
            n13.setText(arr[12].toString())
            n14.setText(arr[13].toString())
            n15.setText(arr[14].toString())
            n16.setText(arr[15].toString())
            n17.setText(arr[16].toString())
            n18.setText(arr[17].toString())
            n19.setText(arr[18].toString())
            n20.setText(arr[19].toString())
            n21.setText(arr[20].toString())
            n22.setText(arr[21].toString())
            n23.setText(arr[22].toString())
            n24.setText(arr[23].toString())
            n25.setText(arr[24].toString())
            n26.setText(arr[25].toString())
            n27.setText(arr[26].toString())
            n28.setText(arr[27].toString())
            n29.setText(arr[28].toString())
            n30.setText(arr[29].toString())
        }

        fun fin(num : Int){
            if(num==60){
                timer1.stop()
            }
        }
        n1.setOnClickListener{
            if(count>29) count =0

            if(arr[0]==change[count]){
                count++
                n1.setText((arr[0]+30).toString())
                chilk++
                if(chilk>30) {
                    n1.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)

        }
        n2.setOnClickListener{
            if(count>29) count =0

            if(arr[1]==change[count]){
                count++
                n2.setText((arr[1]+30).toString())
                chilk++
            }
            if(chilk>30) {
                n2.setVisibility(View.INVISIBLE)
            }
            fin(chilk)
        }
        n3.setOnClickListener{
            if(count>29) count =0
            if(arr[2]==change[count]){
                count++
                n3.setText((arr[2]+30).toString())
                chilk++
                if(chilk>30) {
                    n3.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n4.setOnClickListener{
            if(count>29) count =0
            if(arr[3]==change[count]){
                count++
                n4.setText((arr[3]+30).toString())
                chilk++
                if(chilk>30) {
                    n4.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n5.setOnClickListener{
            if(count>29) count =0
            if(arr[4]==change[count]){
                count++
                n5.setText((arr[4]+30).toString())
                chilk++
                if(chilk>30) {
                    n5.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n6.setOnClickListener{
            if(count>29) count =0
            if(arr[5]==change[count]){
                count++
                n6.setText((arr[5]+30).toString())
                chilk++
                if(chilk>30) {
                    n6.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n7.setOnClickListener{
            if(count>29) count =0
            if(arr[6]==change[count]){
                count++
                n7.setText((arr[6]+30).toString())
                chilk++
                if(chilk>30) {
                    n7.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n8.setOnClickListener{
            if(count>29) count =0
            if(arr[7]==change[count]){
                count++
                n8.setText((arr[7]+30).toString())
                chilk++
                if(chilk>30) {
                    n8.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n9.setOnClickListener{
            if(count>29) count =0
            if(arr[8]==change[count]){
                count++
                n9.setText((arr[8]+30).toString())
                chilk++
                if(chilk>30) {
                    n9.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n10.setOnClickListener{
            if(count>29) count =0
            if(arr[9]==change[count]){
                count++
                n10.setText((arr[9]+30).toString())
                chilk++
                if(chilk>30) {
                    n10.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n11.setOnClickListener{
            if(count>29) count =0
            if(arr[10]==change[count]){
                count++
                n11.setText((arr[10]+30).toString())
                chilk++
                if(chilk>30) {
                    n11.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n12.setOnClickListener{
            if(count>29) count =0
            if(arr[11]==change[count]){
                count++
                n12.setText((arr[11]+30).toString())
                chilk++
                if(chilk>30) {
                    n12.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n13.setOnClickListener{
            if(count>29) count =0
            if(arr[12]==change[count]){
                count++
                n13.setText((arr[12]+30).toString())
                chilk++
                if(chilk>30) {
                    n13.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n14.setOnClickListener{
            if(count>29) count =0
            if(arr[13]==change[count]){
                count++
                n14.setText((arr[13]+30).toString())
                chilk++
                if(chilk>30) {
                    n14.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n15.setOnClickListener{
            if(count>29) count =0
            if(arr[14]==change[count]){
                count++
                n15.setText((arr[14]+30).toString())
                chilk++
                if(chilk>30) {
                    n15.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n16.setOnClickListener{
            if(count>29) count =0
            if(arr[15]==change[count]){
                count++
                n16.setText((arr[15]+30).toString())
                chilk++
                if(chilk>30) {
                    n16.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n17.setOnClickListener{
            if(count>29) count =0
            if(arr[16]==change[count]){
                count++
                n17.setText((arr[16]+30).toString())
                chilk++
                if(chilk>30) {
                    n17.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n18.setOnClickListener{
            if(count>29) count =0
            if(arr[17]==change[count]){
                count++
                n18.setText((arr[17]+30).toString())
                chilk++
                if(chilk>30) {
                    n18.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n19.setOnClickListener{
            if(count>29) count =0
            if(arr[18]==change[count]){
                count++
                n19.setText((arr[18]+30).toString())
                chilk++
                if(chilk>30) {
                    n19.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n20.setOnClickListener{
            if(count>29) count =0
            if(arr[19]==change[count]){
                count++
                n20.setText((arr[19]+30).toString())
                chilk++
                if(chilk>30) {
                    n20.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n21.setOnClickListener{
            if(count>29) count =0
            if(arr[20]==change[count]){
                count++
                n21.setText((arr[20]+30).toString())
                chilk++
                if(chilk>30) {
                    n21.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n22.setOnClickListener{
            if(count>29) count =0
            if(arr[21]==change[count]){
                count++
                n22.setText((arr[21]+30).toString())
                chilk++
                if(chilk>30) {
                    n22.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n23.setOnClickListener{
            if(count>29) count =0
            if(arr[22]==change[count]){
                count++
                n23.setText((arr[22]+30).toString())
                chilk++
                if(chilk>30) {
                    n23.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n24.setOnClickListener{
            if(count>29) count =0
            if(arr[23]==change[count]){
                count++
                n24.setText((arr[23]+30).toString())
                chilk++
                if(chilk>30) {
                    n24.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n25.setOnClickListener{
            if(count>29) count =0
            if(arr[24]==change[count]){
                count++
                n25.setText((arr[24]+30).toString())
                chilk++
                if(chilk>30) {
                    n25.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n26.setOnClickListener{
            if(count>29) count =0
            if(arr[25]==change[count]){
                count++
                n26.setText((arr[25]+30).toString())
                chilk++
                if(chilk>30) {
                    n26.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n27.setOnClickListener{
            if(count>29) count =0
            if(arr[26]==change[count]){
                count++
                n27.setText((arr[26]+30).toString())
                chilk++
                if(chilk>30) {
                    n27.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n28.setOnClickListener{
            if(count>29) count =0
            if(arr[27]==change[count]){
                count++
                n28.setText((arr[27]+30).toString())
                chilk++
                if(chilk>30) {
                    n28.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n29.setOnClickListener{
            if(count>29) count =0
            if(arr[28]==change[count]){
                count++
                n29.setText((arr[28]+30).toString())
                chilk++
                if(chilk>30) {
                    n29.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }
        n30.setOnClickListener{
            if(count>29) count =0
            if(arr[29]==change[count]){
                count++
                n30.setText((arr[29]+30).toString())
                chilk++
                if(chilk>30) {
                    n30.setVisibility(View.INVISIBLE)
                }
            }
            fin(chilk)
        }

    }
}