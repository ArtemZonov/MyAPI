package com.jkdajac.myapi

import com.google.gson.annotations.SerializedName

data class ResponseMain (
    @SerializedName("activity") val activity : String,
    @SerializedName("type") val type : String,
    @SerializedName("participants") val participants : Double,
    @SerializedName("price") val price : Double,
    @SerializedName("link") val link : String,
    @SerializedName("key") val key : String,
    @SerializedName("accessibility") val accessibility : String
        )

