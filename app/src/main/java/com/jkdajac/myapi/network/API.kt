package com.jkdajac.myapi.network

import com.jkdajac.myapi.ResponseMain
import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("activity")
    fun getRandomIdea() : Call<ResponseMain>

}




