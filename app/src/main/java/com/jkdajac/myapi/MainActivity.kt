package com.jkdajac.myapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jkdajac.myapi.network.API
import com.jkdajac.myapi.network.RetrofitClient
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val retrofit = RetrofitClient().getClient("https://www.boredapi.com/api/").create(API::class.java)
        retrofit.getRandomIdea().enqueue(object  : Callback<ResponseMain> {
            override fun onResponse(call: Call<ResponseMain>, response: Response<ResponseMain>) {
                btButton.setOnClickListener {

                    tvText.text = response.body()?.activity
                    tvText2.text = response.body()?.type
                    tvText3.text = response.body()?.participants.toString()
                    tvText4.text = response.body()?.price.toString()
                    tvText5.text = response.body()?.link
                    tvText6.text = response.body()?.key
                    tvText7.text = response.body()?.accessibility

                }
            }

            override fun onFailure(call: Call<ResponseMain>, t: Throwable) {

            }
        })

    }
}




